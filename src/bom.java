import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class bom extends emi {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<ajv, bol> f = new Object2ObjectOpenHashMap();

   public static emi.a<bom> a(long $$0) {
      return new emi.a<>(() -> new bom($$0), ($$1, $$2) -> a($$0, $$1), ays.m);
   }

   public bom(long $$0) {
      this.b = $$0;
   }

   public axt a(ajv $$0) {
      axt $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new bom.a($$1);
   }

   private bol c(ajv $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bol b(ajv $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bol($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<ajv, bol> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public to a(to $$0, ip.a $$1) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      to $$2 = new to();
      this.f.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), (ul)bol.a.encodeStart(uc.a, $$2x).result().orElseThrow()));
      $$0.a("sequences", $$2);
      return $$0;
   }

   private static boolean a(to $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static bom a(long $$0, to $$1) {
      bom $$2 = new bom($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      to $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bol $$6 = (bol)((Pair)bol.a.decode(uc.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(new ajv($$5), $$6);
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

   public void b(ajv $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(ajv $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements axt {
      private final axt c;

      a(axt $$0) {
         this.c = $$0;
      }

      @Override
      public axt d() {
         bom.this.c();
         return this.c.d();
      }

      @Override
      public dvn e() {
         bom.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         bom.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         bom.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         bom.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         bom.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         bom.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         bom.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         bom.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         bom.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof bom.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
