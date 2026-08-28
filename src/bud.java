import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class bud extends exh {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<ale, buc> f = new Object2ObjectOpenHashMap();

   public static exh.a<bud> a(long $$0) {
      return new exh.a<>(() -> new bud($$0), ($$1, $$2) -> a($$0, $$1), baz.m);
   }

   public bud(long $$0) {
      this.b = $$0;
   }

   public azt a(ale $$0) {
      azt $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new bud.a($$1);
   }

   private buc c(ale $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private buc b(ale $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new buc($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<ale, buc> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public tx a(tx $$0, jg.a $$1) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      tx $$2 = new tx();
      this.f.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), (uu)buc.a.encodeStart(ul.a, $$2x).result().orElseThrow()));
      $$0.a("sequences", $$2);
      return $$0;
   }

   private static boolean a(tx $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static bud a(long $$0, tx $$1) {
      bud $$2 = new bud($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      tx $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            buc $$6 = (buc)((Pair)buc.a.decode(ul.a, $$3.c($$5)).result().get()).getFirst();
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

   class a implements azt {
      private final azt c;

      a(final azt $$0) {
         this.c = $$0;
      }

      @Override
      public azt d() {
         bud.this.g();
         return this.c.d();
      }

      @Override
      public ega e() {
         bud.this.g();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         bud.this.g();
         this.c.b($$0);
      }

      @Override
      public int f() {
         bud.this.g();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         bud.this.g();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         bud.this.g();
         return this.c.g();
      }

      @Override
      public boolean h() {
         bud.this.g();
         return this.c.h();
      }

      @Override
      public float i() {
         bud.this.g();
         return this.c.i();
      }

      @Override
      public double j() {
         bud.this.g();
         return this.c.j();
      }

      @Override
      public double k() {
         bud.this.g();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof bud.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
