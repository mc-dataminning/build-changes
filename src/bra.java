import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class bra extends epb {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<ale, bqz> f = new Object2ObjectOpenHashMap();

   public static epb.a<bra> a(long $$0) {
      return new epb.a<>(() -> new bra($$0), ($$1, $$2) -> a($$0, $$1), baf.m);
   }

   public bra(long $$0) {
      this.b = $$0;
   }

   public azg a(ale $$0) {
      azg $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new bra.a($$1);
   }

   private bqz c(ale $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bqz b(ale $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bqz($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<ale, bqz> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public ur a(ur $$0, jk.a $$1) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      ur $$2 = new ur();
      this.f.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), (vo)bqz.a.encodeStart(vf.a, $$2x).result().orElseThrow()));
      $$0.a("sequences", $$2);
      return $$0;
   }

   private static boolean a(ur $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static bra a(long $$0, ur $$1) {
      bra $$2 = new bra($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      ur $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bqz $$6 = (bqz)((Pair)bqz.a.decode(vf.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(new ale($$5), $$6);
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

   public void b(ale $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(ale $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements azg {
      private final azg c;

      a(final azg $$0) {
         this.c = $$0;
      }

      @Override
      public azg d() {
         bra.this.c();
         return this.c.d();
      }

      @Override
      public dyg e() {
         bra.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         bra.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         bra.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         bra.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         bra.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         bra.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         bra.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         bra.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         bra.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof bra.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
