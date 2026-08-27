import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bqr {
   private static final int a = axz.d(38.25F);
   private final Map<iw<btc>, bqr.a> b = new Object2ObjectOpenHashMap();
   private final bqs c;
   private final int d;
   private final Function<bqt, kv> e;
   @Nullable
   private String f;
   private int g;

   protected bqr(bqs $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> {
         int $$2 = $$1x.f() ? a : 255;
         return kp.a(kx.u, axj.b.b($$2, $$1));
      };
   }

   protected bqr(bqs $$0, int $$1, kv $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> $$2;
   }

   public int b() {
      return this.g;
   }

   public boolean a(bsa $$0, int $$1) {
      return true;
   }

   public void a(@Nullable brh $$0, @Nullable brh $$1, bsa $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bsa $$0, int $$1) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.f == null) {
         this.f = ac.a("effect", ld.d.b(this));
      }

      return this.f;
   }

   public String d() {
      return this.c();
   }

   public wu e() {
      return wu.c(this.d());
   }

   public bqs f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public bqr a(iw<btc> $$0, String $$1, double $$2, btf.a $$3) {
      this.b.put($$0, new bqr.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bqr a(int $$0) {
      this.g = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<iw<btc>, btf> $$1) {
      this.b.forEach(($$2, $$3) -> $$1.accept((iw<btc>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(bte $$0) {
      for (Entry<iw<btc>, bqr.a> $$1 : this.b.entrySet()) {
         btd $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bte $$0, int $$1) {
      for (Entry<iw<btc>, bqr.a> $$2 : this.b.entrySet()) {
         btd $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.c == bqs.a;
   }

   public kv a(bqt $$0) {
      return this.e.apply($$0);
   }

   static record a(UUID a, double b, btf.a c) {
      public btf a(String $$0, int $$1) {
         return new btf(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}
