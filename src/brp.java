import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class brp extends ern {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<alb, bro> f = new Object2ObjectOpenHashMap();

   public static ern.a<brp> a(long $$0) {
      return new ern.a<>(() -> new brp($$0), ($$1, $$2) -> a($$0, $$1), bal.m);
   }

   public brp(long $$0) {
      this.b = $$0;
   }

   public azk a(alb $$0) {
      azk $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new brp.a($$1);
   }

   private bro c(alb $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bro b(alb $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bro($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<alb, bro> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public uf a(uf $$0, jp.a $$1) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      uf $$2 = new uf();
      this.f.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), (vc)bro.a.encodeStart(ut.a, $$2x).result().orElseThrow()));
      $$0.a("sequences", $$2);
      return $$0;
   }

   private static boolean a(uf $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static brp a(long $$0, uf $$1) {
      brp $$2 = new brp($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      uf $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bro $$6 = (bro)((Pair)bro.a.decode(ut.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(alb.a($$5), $$6);
         } catch (Exception var9) {
            a.error("Failed to load random sequence {}", $$5, var9);
         }
      }

      return $$2;
   }

   public int a() {
      int $$0 = this.f.size();
      this.f.clear();
      return $$0;
   }

   public void b(alb $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(alb $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements azk {
      private final azk c;

      a(final azk $$0) {
         this.c = $$0;
      }

      @Override
      public azk d() {
         brp.this.c();
         return this.c.d();
      }

      @Override
      public eaj e() {
         brp.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         brp.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         brp.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         brp.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         brp.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         brp.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         brp.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         brp.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         brp.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof brp.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
