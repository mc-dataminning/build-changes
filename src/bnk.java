import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class bnk extends eju {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<ajh, bnj> f = new Object2ObjectOpenHashMap();

   public static eju.a<bnk> a(long $$0) {
      return new eju.a<>(() -> new bnk($$0), ($$1, $$2) -> a($$0, $$1), ayc.m);
   }

   public bnk(long $$0) {
      this.b = $$0;
   }

   public axd a(ajh $$0) {
      axd $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new bnk.a($$1);
   }

   private bnj c(ajh $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bnj b(ajh $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bnj($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<ajh, bnj> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public ta a(ta $$0, in.a $$1) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      ta $$2 = new ta();
      this.f.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), (tx)bnj.a.encodeStart(to.a, $$2x).result().orElseThrow()));
      $$0.a("sequences", $$2);
      return $$0;
   }

   private static boolean a(ta $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static bnk a(long $$0, ta $$1) {
      bnk $$2 = new bnk($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      ta $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bnj $$6 = (bnj)((Pair)bnj.a.decode(to.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(new ajh($$5), $$6);
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

   public void b(ajh $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(ajh $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements axd {
      private final axd c;

      a(axd $$0) {
         this.c = $$0;
      }

      @Override
      public axd d() {
         bnk.this.c();
         return this.c.d();
      }

      @Override
      public dtb e() {
         bnk.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         bnk.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         bnk.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         bnk.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         bnk.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         bnk.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         bnk.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         bnk.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         bnk.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof bnk.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
