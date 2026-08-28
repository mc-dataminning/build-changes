import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class bsn extends euj {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<aku, bsm> f = new Object2ObjectOpenHashMap();

   public static euj.a<bsn> a(long $$0) {
      return new euj.a<>(() -> new bsn($$0), ($$1, $$2) -> a($$0, $$1), bam.m);
   }

   public bsn(long $$0) {
      this.b = $$0;
   }

   public azg a(aku $$0) {
      azg $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new bsn.a($$1);
   }

   private bsm c(aku $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bsm b(aku $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bsm($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<aku, bsm> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public tq a(tq $$0, jt.a $$1) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      tq $$2 = new tq();
      this.f.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), (un)bsm.a.encodeStart(ue.a, $$2x).result().orElseThrow()));
      $$0.a("sequences", $$2);
      return $$0;
   }

   private static boolean a(tq $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static bsn a(long $$0, tq $$1) {
      bsn $$2 = new bsn($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      tq $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bsm $$6 = (bsm)((Pair)bsm.a.decode(ue.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(aku.a($$5), $$6);
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

   public void b(aku $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(aku $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements azg {
      private final azg c;

      a(final azg $$0) {
         this.c = $$0;
      }

      @Override
      public azg d() {
         bsn.this.c();
         return this.c.d();
      }

      @Override
      public edd e() {
         bsn.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         bsn.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         bsn.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         bsn.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         bsn.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         bsn.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         bsn.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         bsn.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         bsn.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof bsn.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
