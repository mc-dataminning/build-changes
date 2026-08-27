import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class bpt extends enh {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<akh, bps> f = new Object2ObjectOpenHashMap();

   public static enh.a<bpt> a(long $$0) {
      return new enh.a<>(() -> new bpt($$0), ($$1, $$2) -> a($$0, $$1), azf.m);
   }

   public bpt(long $$0) {
      this.b = $$0;
   }

   public ayg a(akh $$0) {
      ayg $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new bpt.a($$1);
   }

   private bps c(akh $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bps b(akh $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bps($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<akh, bps> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public ua a(ua $$0, iy.a $$1) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      ua $$2 = new ua();
      this.f.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), (ux)bps.a.encodeStart(uo.a, $$2x).result().orElseThrow()));
      $$0.a("sequences", $$2);
      return $$0;
   }

   private static boolean a(ua $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static bpt a(long $$0, ua $$1) {
      bpt $$2 = new bpt($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      ua $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bps $$6 = (bps)((Pair)bps.a.decode(uo.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(new akh($$5), $$6);
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

   public void b(akh $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(akh $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements ayg {
      private final ayg c;

      a(ayg $$0) {
         this.c = $$0;
      }

      @Override
      public ayg d() {
         bpt.this.c();
         return this.c.d();
      }

      @Override
      public dwm e() {
         bpt.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         bpt.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         bpt.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         bpt.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         bpt.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         bpt.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         bpt.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         bpt.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         bpt.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof bpt.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
