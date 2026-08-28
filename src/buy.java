import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class buy extends ezc {
   public static final ezd<buy> a = new ezd<>("random_sequences", $$0 -> new buy($$0.c()), $$0 -> a($$0.c()), bbf.m);
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<alk, bux> f = new Object2ObjectOpenHashMap();

   public buy(long $$0) {
      this.b = $$0;
   }

   private buy(long $$0, int $$1, boolean $$2, boolean $$3, Map<alk, bux> $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f.putAll($$4);
   }

   public static Codec<buy> a(long $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(
                  RecordCodecBuilder.point($$0),
                  Codec.INT.fieldOf("salt").forGetter($$0xx -> $$0xx.c),
                  Codec.BOOL.optionalFieldOf("include_world_seed", true).forGetter($$0xx -> $$0xx.d),
                  Codec.BOOL.optionalFieldOf("include_sequence_id", true).forGetter($$0xx -> $$0xx.e),
                  Codec.unboundedMap(alk.a, bux.a).fieldOf("sequences").forGetter($$0xx -> $$0xx.f)
               )
               .apply($$1, buy::new)
      );
   }

   public azz a(alk $$0) {
      azz $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new buy.a($$1);
   }

   private bux c(alk $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bux b(alk $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bux($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<alk, bux> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public int a() {
      int $$0 = this.f.size();
      this.f.clear();
      return $$0;
   }

   public void b(alk $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(alk $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements azz {
      private final azz c;

      a(final azz $$0) {
         this.c = $$0;
      }

      @Override
      public azz d() {
         buy.this.f();
         return this.c.d();
      }

      @Override
      public ehs e() {
         buy.this.f();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         buy.this.f();
         this.c.b($$0);
      }

      @Override
      public int f() {
         buy.this.f();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         buy.this.f();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         buy.this.f();
         return this.c.g();
      }

      @Override
      public boolean h() {
         buy.this.f();
         return this.c.h();
      }

      @Override
      public float i() {
         buy.this.f();
         return this.c.i();
      }

      @Override
      public double j() {
         buy.this.f();
         return this.c.j();
      }

      @Override
      public double k() {
         buy.this.f();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof buy.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
