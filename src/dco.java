import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public interface dco {
   Codec<dco> a = mb.aA.q().dispatch(dco::a, dco.i::a);
   yn<wa, dco> b = yl.a(mc.aG).b(dco::a, dco.i::b);

   <T> Stream<T> a(bak var1, dcg<T> var2);

   dco.i<? extends dco> a();

   default boolean a(crs $$0) {
      return true;
   }

   default List<cwo> a(bak $$0) {
      return this.a($$0, dco.e.a).toList();
   }

   default cwo b(bak $$0) {
      return this.a($$0, dco.e.a).findFirst().orElse(cwo.j);
   }

   public static class a implements dco {
      public static final dco.a c = new dco.a();
      public static final MapCodec<dco.a> d = MapCodec.unit(c);
      public static final yn<wa, dco.a> e = yn.a(c);
      public static final dco.i<dco.a> f = new dco.i<>(d, e);

      private a() {
      }

      @Override
      public dco.i<dco.a> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<any fuel>";
      }

      @Override
      public <T> Stream<T> a(bak $$0, dcg<T> $$1) {
         if ($$1 instanceof dcg.b<T> $$2) {
            duw $$3 = $$0.c(dcp.a);
            if ($$3 != null) {
               return $$3.a().stream().map($$2::a);
            }
         }

         return Stream.empty();
      }
   }

   public static record b(List<dco> f) implements dco {
      public static final MapCodec<dco.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dco.a.listOf().fieldOf("contents").forGetter(dco.b::b)).apply($$0, dco.b::new)
      );
      public static final yn<wa, dco.b> d = yn.a(dco.b.a(yl.a()), dco.b::b, dco.b::new);
      public static final dco.i<dco.b> e = new dco.i<>(c, d);

      @Override
      public dco.i<dco.b> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dcg<T> $$1) {
         return this.f.stream().flatMap($$2 -> $$2.a($$0, $$1));
      }

      @Override
      public boolean a(crs $$0) {
         return this.f.stream().allMatch($$1 -> $$1.a($$0));
      }

      public List<dco> b() {
         return this.f;
      }
   }

   public static class c implements dco {
      public static final dco.c c = new dco.c();
      public static final MapCodec<dco.c> d = MapCodec.unit(c);
      public static final yn<wa, dco.c> e = yn.a(c);
      public static final dco.i<dco.c> f = new dco.i<>(d, e);

      private c() {
      }

      @Override
      public dco.i<dco.c> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<empty>";
      }

      @Override
      public <T> Stream<T> a(bak $$0, dcg<T> $$1) {
         return Stream.empty();
      }
   }

   public static record d(jr<cwk> f) implements dco {
      public static final MapCodec<dco.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwk.e.fieldOf("item").forGetter(dco.d::b)).apply($$0, dco.d::new));
      public static final yn<wa, dco.d> d = yn.a(yl.b(mc.K), dco.d::b, dco.d::new);
      public static final dco.i<dco.d> e = new dco.i<>(c, d);

      public d(cwk $$0) {
         this($$0.f());
      }

      @Override
      public dco.i<dco.d> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dcg<T> $$1) {
         return $$1 instanceof dcg.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean a(crs $$0) {
         return this.f.a().a($$0);
      }

      public jr<cwk> b() {
         return this.f;
      }
   }

   public static class e implements dcg.b<cwo> {
      public static final dco.e a = new dco.e();

      public cwo b(cwo $$0) {
         return $$0;
      }
   }

   public static record f(cwo f) implements dco {
      public static final MapCodec<dco.f> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwo.c.fieldOf("item").forGetter(dco.f::b)).apply($$0, dco.f::new));
      public static final yn<wa, dco.f> d = yn.a(cwo.h, dco.f::b, dco.f::new);
      public static final dco.i<dco.f> e = new dco.i<>(c, d);

      @Override
      public dco.i<dco.f> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dcg<T> $$1) {
         return $$1 instanceof dcg.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof dco.f $$1 && cwo.a(this.f, $$1.f)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public boolean a(crs $$0) {
         return this.f.h().a($$0);
      }

      public cwo b() {
         return this.f;
      }
   }

   public static record g(dco f, dco g, dco h) implements dco {
      public static final MapCodec<dco.g> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dco.a.fieldOf("base").forGetter(dco.g::b), dco.a.fieldOf("material").forGetter(dco.g::c), dco.a.fieldOf("pattern").forGetter(dco.g::d)
               )
               .apply($$0, dco.g::new)
      );
      public static final yn<wa, dco.g> d = yn.a(dco.b, dco.g::b, dco.b, dco.g::c, dco.b, dco.g::d, dco.g::new);
      public static final dco.i<dco.g> e = new dco.i<>(c, d);

      @Override
      public dco.i<dco.g> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dcg<T> $$1) {
         if ($$1 instanceof dcg.b<T> $$2) {
            jt.a $$3 = $$0.c(dcp.b);
            if ($$3 != null) {
               azh $$4 = azh.a((long)System.identityHashCode(this));
               List<cwo> $$5 = this.f.a($$0);
               if ($$5.isEmpty()) {
                  return Stream.empty();
               }

               List<cwo> $$6 = this.g.a($$0);
               if ($$6.isEmpty()) {
                  return Stream.empty();
               }

               List<cwo> $$7 = this.h.a($$0);
               if ($$7.isEmpty()) {
                  return Stream.empty();
               }

               return Stream.<cwo>generate(() -> {
                  cwo $$5x = af.a($$5, $$4);
                  cwo $$6x = af.a($$6, $$4);
                  cwo $$7x = af.a($$7, $$4);
                  return dcb.a($$3, $$5x, $$6x, $$7x);
               }).limit(256L).filter($$0x -> !$$0x.f()).limit(16L).map($$2::a);
            }
         }

         return Stream.empty();
      }

      public dco b() {
         return this.f;
      }

      public dco c() {
         return this.g;
      }

      public dco d() {
         return this.h;
      }
   }

   public static record h(axf<cwk> f) implements dco {
      public static final MapCodec<dco.h> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axf.a(mc.K).fieldOf("tag").forGetter(dco.h::b)).apply($$0, dco.h::new)
      );
      public static final yn<wa, dco.h> d = yn.a(axf.c(mc.K), dco.h::b, dco.h::new);
      public static final dco.i<dco.h> e = new dco.i<>(c, d);

      @Override
      public dco.i<dco.h> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dcg<T> $$1) {
         if ($$1 instanceof dcg.b<T> $$2) {
            jt.a $$3 = $$0.c(dcp.b);
            if ($$3 != null) {
               return $$3.d(mc.K).a(this.f).map($$1x -> $$1x.a().map($$2::a)).stream().flatMap($$0x -> $$0x);
            }
         }

         return Stream.empty();
      }

      public axf<cwk> b() {
         return this.f;
      }
   }

   public static record i<T extends dco>(MapCodec<T> a, yn<wa, T> b) {
   }

   public static record j(dco f, dco g) implements dco {
      public static final MapCodec<dco.j> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dco.a.fieldOf("input").forGetter(dco.j::b), dco.a.fieldOf("remainder").forGetter(dco.j::c)).apply($$0, dco.j::new)
      );
      public static final yn<wa, dco.j> d = yn.a(dco.b, dco.j::b, dco.b, dco.j::c, dco.j::new);
      public static final dco.i<dco.j> e = new dco.i<>(c, d);

      @Override
      public dco.i<dco.j> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dcg<T> $$1) {
         if ($$1 instanceof dcg.a<T> $$2) {
            List<T> $$3 = this.g.a($$0, $$1).toList();
            return this.f.a($$0, $$1).map($$2x -> $$2.a((T)$$2x, $$3));
         } else {
            return this.f.a($$0, $$1);
         }
      }

      @Override
      public boolean a(crs $$0) {
         return this.f.a($$0) && this.g.a($$0);
      }

      public dco b() {
         return this.f;
      }

      public dco c() {
         return this.g;
      }
   }
}
