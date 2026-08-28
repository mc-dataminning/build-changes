import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public interface ddo {
   Codec<ddo> a = ma.aA.q().dispatch(ddo::a, ddo.i::a);
   zt<xg, ddo> b = zr.a(mb.aG).b(ddo::a, ddo.i::b);

   <T> Stream<T> a(bbp var1, ddg<T> var2);

   ddo.i<? extends ddo> a();

   default boolean a(css $$0) {
      return true;
   }

   default List<cxo> a(bbp $$0) {
      return this.a($$0, ddo.e.a).toList();
   }

   default cxo b(bbp $$0) {
      return this.a($$0, ddo.e.a).findFirst().orElse(cxo.k);
   }

   public static class a implements ddo {
      public static final ddo.a c = new ddo.a();
      public static final MapCodec<ddo.a> d = MapCodec.unit(c);
      public static final zt<xg, ddo.a> e = zt.a(c);
      public static final ddo.i<ddo.a> f = new ddo.i<>(d, e);

      private a() {
      }

      @Override
      public ddo.i<ddo.a> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<any fuel>";
      }

      @Override
      public <T> Stream<T> a(bbp $$0, ddg<T> $$1) {
         if ($$1 instanceof ddg.b<T> $$2) {
            dvu $$3 = $$0.c(ddp.a);
            if ($$3 != null) {
               return $$3.a().stream().map($$2::a);
            }
         }

         return Stream.empty();
      }
   }

   public static record b(List<ddo> f) implements ddo {
      public static final MapCodec<ddo.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ddo.a.listOf().fieldOf("contents").forGetter(ddo.b::b)).apply($$0, ddo.b::new)
      );
      public static final zt<xg, ddo.b> d = zt.a(ddo.b.a(zr.a()), ddo.b::b, ddo.b::new);
      public static final ddo.i<ddo.b> e = new ddo.i<>(c, d);

      @Override
      public ddo.i<ddo.b> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbp $$0, ddg<T> $$1) {
         return this.f.stream().flatMap($$2 -> $$2.a($$0, $$1));
      }

      @Override
      public boolean a(css $$0) {
         return this.f.stream().allMatch($$1 -> $$1.a($$0));
      }

      public List<ddo> b() {
         return this.f;
      }
   }

   public static class c implements ddo {
      public static final ddo.c c = new ddo.c();
      public static final MapCodec<ddo.c> d = MapCodec.unit(c);
      public static final zt<xg, ddo.c> e = zt.a(c);
      public static final ddo.i<ddo.c> f = new ddo.i<>(d, e);

      private c() {
      }

      @Override
      public ddo.i<ddo.c> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<empty>";
      }

      @Override
      public <T> Stream<T> a(bbp $$0, ddg<T> $$1) {
         return Stream.empty();
      }
   }

   public static record d(jq<cxk> f) implements ddo {
      public static final MapCodec<ddo.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alw.a(mb.K).fieldOf("item").forGetter(ddo.d::b)).apply($$0, ddo.d::new)
      );
      public static final zt<xg, ddo.d> d = zt.a(zr.b(mb.K), ddo.d::b, ddo.d::new);
      public static final ddo.i<ddo.d> e = new ddo.i<>(c, d);

      public d(cxk $$0) {
         this($$0.f());
      }

      @Override
      public ddo.i<ddo.d> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbp $$0, ddg<T> $$1) {
         return $$1 instanceof ddg.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean a(css $$0) {
         return this.f.a().a($$0);
      }

      public jq<cxk> b() {
         return this.f;
      }
   }

   public static class e implements ddg.b<cxo> {
      public static final ddo.e a = new ddo.e();

      public cxo b(cxo $$0) {
         return $$0;
      }
   }

   public static record f(cxo f) implements ddo {
      public static final MapCodec<ddo.f> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxo.d.fieldOf("item").forGetter(ddo.f::b)).apply($$0, ddo.f::new));
      public static final zt<xg, ddo.f> d = zt.a(cxo.i, ddo.f::b, ddo.f::new);
      public static final ddo.i<ddo.f> e = new ddo.i<>(c, d);

      @Override
      public ddo.i<ddo.f> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbp $$0, ddg<T> $$1) {
         return $$1 instanceof ddg.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof ddo.f $$1 && cxo.a(this.f, $$1.f)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public boolean a(css $$0) {
         return this.f.h().a($$0);
      }

      public cxo b() {
         return this.f;
      }
   }

   public static record g(ddo f, ddo g, ddo h) implements ddo {
      public static final MapCodec<ddo.g> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ddo.a.fieldOf("base").forGetter(ddo.g::b), ddo.a.fieldOf("material").forGetter(ddo.g::c), ddo.a.fieldOf("pattern").forGetter(ddo.g::d)
               )
               .apply($$0, ddo.g::new)
      );
      public static final zt<xg, ddo.g> d = zt.a(ddo.b, ddo.g::b, ddo.b, ddo.g::c, ddo.b, ddo.g::d, ddo.g::new);
      public static final ddo.i<ddo.g> e = new ddo.i<>(c, d);

      @Override
      public ddo.i<ddo.g> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbp $$0, ddg<T> $$1) {
         if ($$1 instanceof ddg.b<T> $$2) {
            js.a $$3 = $$0.c(ddp.b);
            if ($$3 != null) {
               bam $$4 = bam.a((long)System.identityHashCode(this));
               List<cxo> $$5 = this.f.a($$0);
               if ($$5.isEmpty()) {
                  return Stream.empty();
               }

               List<cxo> $$6 = this.g.a($$0);
               if ($$6.isEmpty()) {
                  return Stream.empty();
               }

               List<cxo> $$7 = this.h.a($$0);
               if ($$7.isEmpty()) {
                  return Stream.empty();
               }

               return Stream.<cxo>generate(() -> {
                  cxo $$5x = ae.a($$5, $$4);
                  cxo $$6x = ae.a($$6, $$4);
                  cxo $$7x = ae.a($$7, $$4);
                  return ddb.a($$3, $$5x, $$6x, $$7x);
               }).limit(256L).filter($$0x -> !$$0x.f()).limit(16L).map($$2::a);
            }
         }

         return Stream.empty();
      }

      public ddo b() {
         return this.f;
      }

      public ddo c() {
         return this.g;
      }

      public ddo d() {
         return this.h;
      }
   }

   public static record h(ayk<cxk> f) implements ddo {
      public static final MapCodec<ddo.h> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayk.a(mb.K).fieldOf("tag").forGetter(ddo.h::b)).apply($$0, ddo.h::new)
      );
      public static final zt<xg, ddo.h> d = zt.a(ayk.c(mb.K), ddo.h::b, ddo.h::new);
      public static final ddo.i<ddo.h> e = new ddo.i<>(c, d);

      @Override
      public ddo.i<ddo.h> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbp $$0, ddg<T> $$1) {
         if ($$1 instanceof ddg.b<T> $$2) {
            js.a $$3 = $$0.c(ddp.b);
            if ($$3 != null) {
               return $$3.d(mb.K).a(this.f).map($$1x -> $$1x.a().map($$2::a)).stream().flatMap($$0x -> $$0x);
            }
         }

         return Stream.empty();
      }

      public ayk<cxk> b() {
         return this.f;
      }
   }

   public static record i<T extends ddo>(MapCodec<T> a, zt<xg, T> b) {
   }

   public static record j(ddo f, ddo g) implements ddo {
      public static final MapCodec<ddo.j> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ddo.a.fieldOf("input").forGetter(ddo.j::b), ddo.a.fieldOf("remainder").forGetter(ddo.j::c)).apply($$0, ddo.j::new)
      );
      public static final zt<xg, ddo.j> d = zt.a(ddo.b, ddo.j::b, ddo.b, ddo.j::c, ddo.j::new);
      public static final ddo.i<ddo.j> e = new ddo.i<>(c, d);

      @Override
      public ddo.i<ddo.j> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bbp $$0, ddg<T> $$1) {
         if ($$1 instanceof ddg.a<T> $$2) {
            List<T> $$3 = this.g.a($$0, $$1).toList();
            return this.f.a($$0, $$1).map($$2x -> $$2.a((T)$$2x, $$3));
         } else {
            return this.f.a($$0, $$1);
         }
      }

      @Override
      public boolean a(css $$0) {
         return this.f.a($$0) && this.g.a($$0);
      }

      public ddo b() {
         return this.f;
      }

      public ddo c() {
         return this.g;
      }
   }
}
