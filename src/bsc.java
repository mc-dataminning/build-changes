import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bsc implements cpk {
   private static final int a = ayz.d(38.25F);
   private final Map<ji<buu>, bsc.a> b = new Object2ObjectOpenHashMap();
   private final bsd c;
   private final int d;
   private final Function<bse, lg> e;
   @Nullable
   private String f;
   private int g;
   private Optional<avz> h = Optional.empty();
   private cpn i = cpp.g;

   protected bsc(bsd $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> {
         int $$2 = $$1x.f() ? a : 255;
         return lb.a(li.u, ayj.b.b($$2, $$1));
      };
   }

   protected bsc(bsd $$0, int $$1, lg $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> $$2;
   }

   public int b() {
      return this.g;
   }

   public boolean a(btr $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bsw $$0, @Nullable bsw $$1, btr $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(btr $$0, int $$1) {
   }

   public void c(btr $$0, int $$1) {
      this.h.ifPresent($$1x -> $$0.dP().a(null, $$0.du(), $$0.dw(), $$0.dA(), $$1x, $$0.de(), 1.0F, 1.0F));
   }

   public void a(btr $$0, int $$1, bsw.c $$2) {
   }

   public void a(btr $$0, int $$1, brp $$2, float $$3) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.f == null) {
         this.f = ac.a("effect", lp.d.b(this));
      }

      return this.f;
   }

   public String d() {
      return this.c();
   }

   public xp e() {
      return xp.c(this.d());
   }

   public bsd f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public bsc a(ji<buu> $$0, String $$1, double $$2, bux.a $$3) {
      this.b.put($$0, new bsc.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bsc a(int $$0) {
      this.g = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<ji<buu>, bux> $$1) {
      this.b.forEach(($$2, $$3) -> $$1.accept((ji<buu>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(buw $$0) {
      for (Entry<ji<buu>, bsc.a> $$1 : this.b.entrySet()) {
         buv $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(buw $$0, int $$1) {
      for (Entry<ji<buu>, bsc.a> $$2 : this.b.entrySet()) {
         buv $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.c == bsd.a;
   }

   public lg a(bse $$0) {
      return this.e.apply($$0);
   }

   public bsc a(avz $$0) {
      this.h = Optional.of($$0);
      return this;
   }

   public bsc a(cpl... $$0) {
      this.i = cpp.e.a($$0);
      return this;
   }

   @Override
   public cpn i() {
      return this.i;
   }

   static record a(UUID a, double b, bux.a c) {
      public bux a(String $$0, int $$1) {
         return new bux(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}
