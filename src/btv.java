import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class btv extends ewf {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<ald, btu> f = new Object2ObjectOpenHashMap();

   public static ewf.a<btv> a(long $$0) {
      return new ewf.a<>(() -> new btv($$0), ($$1, $$2) -> a($$0, $$1), bax.m);
   }

   public btv(long $$0) {
      this.b = $$0;
   }

   public azs a(ald $$0) {
      azs $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new btv.a($$1);
   }

   private btu c(ald $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private btu b(ald $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new btu($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<ald, btu> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public tw a(tw $$0, ju.a $$1) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      tw $$2 = new tw();
      this.f.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), (ut)btu.a.encodeStart(uk.a, $$2x).result().orElseThrow()));
      $$0.a("sequences", $$2);
      return $$0;
   }

   private static boolean a(tw $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static btv a(long $$0, tw $$1) {
      btv $$2 = new btv($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      tw $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            btu $$6 = (btu)((Pair)btu.a.decode(uk.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(ald.a($$5), $$6);
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

   public void b(ald $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(ald $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements azs {
      private final azs c;

      a(final azs $$0) {
         this.c = $$0;
      }

      @Override
      public azs d() {
         btv.this.g();
         return this.c.d();
      }

      @Override
      public eey e() {
         btv.this.g();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         btv.this.g();
         this.c.b($$0);
      }

      @Override
      public int f() {
         btv.this.g();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         btv.this.g();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         btv.this.g();
         return this.c.g();
      }

      @Override
      public boolean h() {
         btv.this.g();
         return this.c.h();
      }

      @Override
      public float i() {
         btv.this.g();
         return this.c.i();
      }

      @Override
      public double j() {
         btv.this.g();
         return this.c.j();
      }

      @Override
      public double k() {
         btv.this.g();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof btv.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
