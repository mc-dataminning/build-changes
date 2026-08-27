import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class bqb extends eob {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<akm, bqa> f = new Object2ObjectOpenHashMap();

   public static eob.a<bqb> a(long $$0) {
      return new eob.a<>(() -> new bqb($$0), ($$1, $$2) -> a($$0, $$1), azj.m);
   }

   public bqb(long $$0) {
      this.b = $$0;
   }

   public ayk a(akm $$0) {
      ayk $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new bqb.a($$1);
   }

   private bqa c(akm $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bqa b(akm $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bqa($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<akm, bqa> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public ud a(ud $$0, iz.a $$1) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      ud $$2 = new ud();
      this.f.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), (va)bqa.a.encodeStart(ur.a, $$2x).result().orElseThrow()));
      $$0.a("sequences", $$2);
      return $$0;
   }

   private static boolean a(ud $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static bqb a(long $$0, ud $$1) {
      bqb $$2 = new bqb($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      ud $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bqa $$6 = (bqa)((Pair)bqa.a.decode(ur.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(new akm($$5), $$6);
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

   public void b(akm $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(akm $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements ayk {
      private final ayk c;

      a(ayk $$0) {
         this.c = $$0;
      }

      @Override
      public ayk d() {
         bqb.this.c();
         return this.c.d();
      }

      @Override
      public dxg e() {
         bqb.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         bqb.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         bqb.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         bqb.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         bqb.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         bqb.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         bqb.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         bqb.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         bqb.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof bqb.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
