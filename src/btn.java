import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class btn extends evi {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<alz, btm> f = new Object2ObjectOpenHashMap();

   public static evi.a<btn> a(long $$0) {
      return new evi.a<>(() -> new btn($$0), ($$1, $$2) -> a($$0, $$1), bbs.m);
   }

   public btn(long $$0) {
      this.b = $$0;
   }

   public bam a(alz $$0) {
      bam $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new btn.a($$1);
   }

   private btm c(alz $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private btm b(alz $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new btm($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<alz, btm> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public ux a(ux $$0, js.a $$1) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      ux $$2 = new ux();
      this.f.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), (vu)btm.a.encodeStart(vl.a, $$2x).result().orElseThrow()));
      $$0.a("sequences", $$2);
      return $$0;
   }

   private static boolean a(ux $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static btn a(long $$0, ux $$1) {
      btn $$2 = new btn($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      ux $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            btm $$6 = (btm)((Pair)btm.a.decode(vl.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(alz.a($$5), $$6);
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

   public void b(alz $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(alz $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements bam {
      private final bam c;

      a(final bam $$0) {
         this.c = $$0;
      }

      @Override
      public bam d() {
         btn.this.c();
         return this.c.d();
      }

      @Override
      public eec e() {
         btn.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         btn.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         btn.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         btn.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         btn.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         btn.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         btn.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         btn.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         btn.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof btn.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
