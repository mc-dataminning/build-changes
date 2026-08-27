import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class box extends emy {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<akf, bow> f = new Object2ObjectOpenHashMap();

   public static emy.a<box> a(long $$0) {
      return new emy.a<>(() -> new box($$0), ($$1, $$2) -> a($$0, $$1), azc.m);
   }

   public box(long $$0) {
      this.b = $$0;
   }

   public ayd a(akf $$0) {
      ayd $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new box.a($$1);
   }

   private bow c(akf $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bow b(akf $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bow($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<akf, bow> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public ty a(ty $$0, ix.a $$1) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      ty $$2 = new ty();
      this.f.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), (uv)bow.a.encodeStart(um.a, $$2x).result().orElseThrow()));
      $$0.a("sequences", $$2);
      return $$0;
   }

   private static boolean a(ty $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static box a(long $$0, ty $$1) {
      box $$2 = new box($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      ty $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bow $$6 = (bow)((Pair)bow.a.decode(um.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(new akf($$5), $$6);
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

   public void b(akf $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(akf $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements ayd {
      private final ayd c;

      a(ayd $$0) {
         this.c = $$0;
      }

      @Override
      public ayd d() {
         box.this.c();
         return this.c.d();
      }

      @Override
      public dwd e() {
         box.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         box.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         box.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         box.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         box.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         box.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         box.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         box.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         box.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof box.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
