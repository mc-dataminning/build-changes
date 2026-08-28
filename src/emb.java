import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class emb {
   public static final Codec<emb> a = lz.R.q().dispatch(emb::e, emk::codec);
   public static final Codec<jq<emb>> b = alh.a(ma.aS, a);
   protected final emb.c c;

   public static <S extends emb> RecordCodecBuilder<S, emb.c> a(Instance<S> $$0) {
      return emb.c.a.forGetter($$0x -> $$0x.c);
   }

   public static <S extends emb> MapCodec<S> a(Function<emb.c, S> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(a($$1)).apply($$1, $$0));
   }

   protected emb(emb.c $$0) {
      this.c = $$0;
   }

   public ju<dgh> a() {
      return this.c.b;
   }

   public Map<bvh, emi> b() {
      return this.c.c;
   }

   public ebf.a c() {
      return this.c.d;
   }

   public emm d() {
      return this.c.e;
   }

   public elt a(elt $$0) {
      return this.d() != emm.a ? $$0.a(12) : $$0;
   }

   public emj a(ke $$0, dxk $$1, dgl $$2, ebx $$3, eqe $$4, long $$5, del $$6, int $$7, dfh $$8, Predicate<jq<dgh>> $$9) {
      emb.a $$10 = new emb.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8, $$9);
      Optional<emb.b> $$11 = this.b($$10);
      if ($$11.isPresent()) {
         emt $$12 = $$11.get().a();
         emj $$13 = new emj(this, $$6, $$7, $$12.a());
         if ($$13.b()) {
            return $$13;
         }
      }

      return emj.b;
   }

   protected static Optional<emb.b> a(emb.a $$0, ebj.a $$1, Consumer<emt> $$2) {
      del $$3 = $$0.h();
      int $$4 = $$3.b();
      int $$5 = $$3.c();
      int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
      return Optional.of(new emb.b(new jh($$4, $$6, $$5), $$2));
   }

   private static boolean a(emb.b $$0, emb.a $$1) {
      jh $$2 = $$0.b();
      return $$1.j.test($$1.b.d().getNoiseBiome(kb.a($$2.u()), kb.a($$2.v()), kb.a($$2.w()), $$1.d.b()));
   }

   public void a(dgd $$0, dgb $$1, dxk $$2, azv $$3, elt $$4, del $$5, emq $$6) {
   }

   private static int[] c(emb.a $$0, int $$1, int $$2, int $$3, int $$4) {
      dxk $$5 = $$0.b();
      dfh $$6 = $$0.i();
      ebx $$7 = $$0.d();
      return new int[]{
         $$5.c($$1, $$3, ebj.a.a, $$6, $$7),
         $$5.c($$1, $$3 + $$4, ebj.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3, ebj.a.a, $$6, $$7),
         $$5.c($$1 + $$2, $$3 + $$4, ebj.a.a, $$6, $$7)
      };
   }

   public static int a(emb.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$2, $$3, $$4);
      return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
   }

   protected static int a(emb.a $$0, int $$1, int $$2) {
      del $$3 = $$0.h();
      int $$4 = $$3.d();
      int $$5 = $$3.e();
      return b($$0, $$4, $$5, $$1, $$2);
   }

   protected static int b(emb.a $$0, int $$1, int $$2, int $$3, int $$4) {
      int[] $$5 = c($$0, $$1, $$3, $$2, $$4);
      return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
   }

   @Deprecated
   protected jh a(emb.a $$0, dow $$1) {
      int $$2 = 5;
      int $$3 = 5;
      if ($$1 == dow.b) {
         $$2 = -5;
      } else if ($$1 == dow.c) {
         $$2 = -5;
         $$3 = -5;
      } else if ($$1 == dow.d) {
         $$3 = -5;
      }

      del $$4 = $$0.h();
      int $$5 = $$4.a(7);
      int $$6 = $$4.b(7);
      return new jh($$5, b($$0, $$5, $$6, $$2, $$3), $$6);
   }

   protected abstract Optional<emb.b> a(emb.a var1);

   public Optional<emb.b> b(emb.a $$0) {
      return this.a($$0).filter($$1 -> a($$1, $$0));
   }

   public abstract emk<?> e();

   public static record a(ke a, dxk b, dgl c, ebx d, eqe e, eci f, long g, del h, dfh i, Predicate<jq<dgh>> j) {

      public a(ke $$0, dxk $$1, dgl $$2, ebx $$3, eqe $$4, long $$5, del $$6, dfh $$7, Predicate<jq<dgh>> $$8) {
         this($$0, $$1, $$2, $$3, $$4, a($$5, $$6), $$5, $$6, $$7, $$8);
      }

      private static eci a(long $$0, del $$1) {
         eci $$2 = new eci(new ebk(0L));
         $$2.c($$0, $$1.g, $$1.h);
         return $$2;
      }
   }

   public static record b(jh a, Either<Consumer<emt>, emt> b) {
      public b(jh $$0, Consumer<emt> $$1) {
         this($$0, Either.left($$1));
      }

      public emt a() {
         return (emt)this.b.map($$0 -> {
            emt $$1 = new emt();
            $$0.accept($$1);
            return $$1;
         }, $$0 -> $$0);
      }

      public jh b() {
         return this.a;
      }

      public Either<Consumer<emt>, emt> c() {
         return this.b;
      }
   }

   public static record c(ju<dgh> b, Map<bvh, emi> c, ebf.a d, emm e) {
      static final emb.c f = new emb.c(ju.a(), Map.of(), ebf.a.e, emm.a);
      public static final MapCodec<emb.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kf.a(ma.aG).fieldOf("biomes").forGetter(emb.c::a),
                  Codec.simpleMap(bvh.i, emi.a, baj.a(bvh.values())).fieldOf("spawn_overrides").forGetter(emb.c::b),
                  ebf.a.l.fieldOf("step").forGetter(emb.c::c),
                  emm.f.optionalFieldOf("terrain_adaptation", f.e).forGetter(emb.c::d)
               )
               .apply($$0, emb.c::new)
      );

      public c(ju<dgh> $$0) {
         this($$0, f.c, f.d, f.e);
      }

      public ju<dgh> a() {
         return this.b;
      }

      public Map<bvh, emi> b() {
         return this.c;
      }

      public ebf.a c() {
         return this.d;
      }

      public emm d() {
         return this.e;
      }

      public static class a {
         private final ju<dgh> a;
         private Map<bvh, emi> b = emb.c.f.c;
         private ebf.a c = emb.c.f.d;
         private emm d = emb.c.f.e;

         public a(ju<dgh> $$0) {
            this.a = $$0;
         }

         public emb.c.a a(Map<bvh, emi> $$0) {
            this.b = $$0;
            return this;
         }

         public emb.c.a a(ebf.a $$0) {
            this.c = $$0;
            return this;
         }

         public emb.c.a a(emm $$0) {
            this.d = $$0;
            return this;
         }

         public emb.c a() {
            return new emb.c(this.a, this.b, this.c, this.d);
         }
      }
   }
}
