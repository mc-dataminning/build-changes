import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class bkg extends efv {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<ahg, bkf> f = new Object2ObjectOpenHashMap();

   public static efv.a<bkg> a(long $$0) {
      return new efv.a<>(() -> new bkg($$0), $$1 -> a($$0, $$1), avv.m);
   }

   public bkg(long $$0) {
      this.b = $$0;
   }

   public auu a(ahg $$0) {
      auu $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new bkg.a($$1);
   }

   private bkf c(ahg $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bkf b(ahg $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bkf($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<ahg, bkf> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public sn a(sn $$0) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      sn $$1 = new sn();
      this.f.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), (tk)bkf.a.encodeStart(tb.a, $$2).result().orElseThrow()));
      $$0.a("sequences", $$1);
      return $$0;
   }

   private static boolean a(sn $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static bkg a(long $$0, sn $$1) {
      bkg $$2 = new bkg($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      sn $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bkf $$6 = (bkf)((Pair)bkf.a.decode(tb.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(new ahg($$5), $$6);
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

   public void b(ahg $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(ahg $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements auu {
      private final auu c;

      a(auu $$0) {
         this.c = $$0;
      }

      @Override
      public auu d() {
         bkg.this.c();
         return this.c.d();
      }

      @Override
      public dpc e() {
         bkg.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         bkg.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         bkg.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         bkg.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         bkg.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         bkg.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         bkg.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         bkg.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         bkg.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof bkg.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
