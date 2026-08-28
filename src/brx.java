import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class brx extends esf {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<ale, brw> f = new Object2ObjectOpenHashMap();

   public static esf.a<brx> a(long $$0) {
      return new esf.a<>(() -> new brx($$0), ($$1, $$2) -> a($$0, $$1), bao.m);
   }

   public brx(long $$0) {
      this.b = $$0;
   }

   public azn a(ale $$0) {
      azn $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new brx.a($$1);
   }

   private brw c(ale $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private brw b(ale $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new brw($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<ale, brw> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public ug a(ug $$0, jq.a $$1) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      ug $$2 = new ug();
      this.f.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), (vd)brw.a.encodeStart(uu.a, $$2x).result().orElseThrow()));
      $$0.a("sequences", $$2);
      return $$0;
   }

   private static boolean a(ug $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static brx a(long $$0, ug $$1) {
      brx $$2 = new brx($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      ug $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            brw $$6 = (brw)((Pair)brw.a.decode(uu.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(ale.a($$5), $$6);
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

   class a implements azn {
      private final azn c;

      a(final azn $$0) {
         this.c = $$0;
      }

      @Override
      public azn d() {
         brx.this.c();
         return this.c.d();
      }

      @Override
      public ebb e() {
         brx.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         brx.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         brx.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         brx.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         brx.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         brx.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         brx.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         brx.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         brx.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof brx.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
