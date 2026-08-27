import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bpv {
   private static final int a = axw.d(38.25F);
   private final Map<iv<bsg>, bpv.a> b = new Object2ObjectOpenHashMap();
   private final bpw c;
   private final int d;
   private final Function<bpx, ku> e;
   @Nullable
   private String f;
   private int g;

   protected bpv(bpw $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> {
         int $$2 = $$1x.f() ? a : 255;
         return ko.a(kw.u, axg.b.b($$2, $$1));
      };
   }

   protected bpv(bpw $$0, int $$1, ku $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> $$2;
   }

   public int b() {
      return this.g;
   }

   public boolean a(bre $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bql $$0, @Nullable bql $$1, bre $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bre $$0, int $$1) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.f == null) {
         this.f = ac.a("effect", lc.d.b(this));
      }

      return this.f;
   }

   public String d() {
      return this.c();
   }

   public ws e() {
      return ws.c(this.d());
   }

   public bpw f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public bpv a(iv<bsg> $$0, String $$1, double $$2, bsj.a $$3) {
      this.b.put($$0, new bpv.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bpv a(int $$0) {
      this.g = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<iv<bsg>, bsj> $$1) {
      this.b.forEach(($$2, $$3) -> $$1.accept((iv<bsg>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(bsi $$0) {
      for (Entry<iv<bsg>, bpv.a> $$1 : this.b.entrySet()) {
         bsh $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bsi $$0, int $$1) {
      for (Entry<iv<bsg>, bpv.a> $$2 : this.b.entrySet()) {
         bsh $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.c == bpw.a;
   }

   public ku a(bpx $$0) {
      return this.e.apply($$0);
   }

   static record a(UUID a, double b, bsj.a c) {
      public bsj a(String $$0, int $$1) {
         return new bsj(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}
