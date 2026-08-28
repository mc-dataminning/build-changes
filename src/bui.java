import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class bui extends eya {
   public static final eyb<bui> a = new eyb<>("random_sequences", $$0 -> new bui($$0.c()), $$0 -> a($$0.c()), bbb.m);
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<alg, buh> f = new Object2ObjectOpenHashMap();

   public bui(long $$0) {
      this.b = $$0;
   }

   private bui(long $$0, int $$1, boolean $$2, boolean $$3, Map<alg, buh> $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f.putAll($$4);
   }

   public static Codec<bui> a(long $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(
                  RecordCodecBuilder.point($$0),
                  Codec.INT.fieldOf("salt").forGetter($$0xx -> $$0xx.c),
                  Codec.BOOL.optionalFieldOf("include_world_seed", true).forGetter($$0xx -> $$0xx.d),
                  Codec.BOOL.optionalFieldOf("include_sequence_id", true).forGetter($$0xx -> $$0xx.e),
                  Codec.unboundedMap(alg.a, buh.a).fieldOf("sequences").forGetter($$0xx -> $$0xx.f)
               )
               .apply($$1, bui::new)
      );
   }

   public azv a(alg $$0) {
      azv $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new bui.a($$1);
   }

   private buh c(alg $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private buh b(alg $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new buh($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<alg, buh> $$0) {
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

   public void b(alg $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(alg $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements azv {
      private final azv c;

      a(final azv $$0) {
         this.c = $$0;
      }

      @Override
      public azv d() {
         bui.this.f();
         return this.c.d();
      }

      @Override
      public egt e() {
         bui.this.f();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         bui.this.f();
         this.c.b($$0);
      }

      @Override
      public int f() {
         bui.this.f();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         bui.this.f();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         bui.this.f();
         return this.c.g();
      }

      @Override
      public boolean h() {
         bui.this.f();
         return this.c.h();
      }

      @Override
      public float i() {
         bui.this.f();
         return this.c.i();
      }

      @Override
      public double j() {
         bui.this.f();
         return this.c.j();
      }

      @Override
      public double k() {
         bui.this.f();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof bui.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
