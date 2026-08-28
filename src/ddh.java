import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public interface ddh {
   Codec<ddh> a = mb.aA.q().dispatch(ddh::a, ddh.i::a);
   yn<wa, ddh> b = yl.a(mc.aG).b(ddh::a, ddh.i::b);

   <T> Stream<T> a(bak var1, dcz<T> var2);

   ddh.i<? extends ddh> a();

   default boolean a(csn $$0) {
      return true;
   }

   default List<cxh> a(bak $$0) {
      return this.a($$0, ddh.e.a).toList();
   }

   default cxh b(bak $$0) {
      return this.a($$0, ddh.e.a).findFirst().orElse(cxh.k);
   }

   public static class a implements ddh {
      public static final ddh.a c = new ddh.a();
      public static final MapCodec<ddh.a> d = MapCodec.unit(c);
      public static final yn<wa, ddh.a> e = yn.a(c);
      public static final ddh.i<ddh.a> f = new ddh.i<>(d, e);

      private a() {
      }

      @Override
      public ddh.i<ddh.a> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<any fuel>";
      }

      @Override
      public <T> Stream<T> a(bak $$0, dcz<T> $$1) {
         if ($$1 instanceof dcz.b<T> $$2) {
            dvq $$3 = $$0.c(ddi.a);
            if ($$3 != null) {
               return $$3.a().stream().map($$2::a);
            }
         }

         return Stream.empty();
      }
   }

   public static record b(List<ddh> f) implements ddh {
      public static final MapCodec<ddh.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ddh.a.listOf().fieldOf("contents").forGetter(ddh.b::b)).apply($$0, ddh.b::new)
      );
      public static final yn<wa, ddh.b> d = yn.a(ddh.b.a(yl.a()), ddh.b::b, ddh.b::new);
      public static final ddh.i<ddh.b> e = new ddh.i<>(c, d);

      @Override
      public ddh.i<ddh.b> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dcz<T> $$1) {
         return this.f.stream().flatMap($$2 -> $$2.a($$0, $$1));
      }

      @Override
      public boolean a(csn $$0) {
         return this.f.stream().allMatch($$1 -> $$1.a($$0));
      }

      public List<ddh> b() {
         return this.f;
      }
   }

   public static class c implements ddh {
      public static final ddh.c c = new ddh.c();
      public static final MapCodec<ddh.c> d = MapCodec.unit(c);
      public static final yn<wa, ddh.c> e = yn.a(c);
      public static final ddh.i<ddh.c> f = new ddh.i<>(d, e);

      private c() {
      }

      @Override
      public ddh.i<ddh.c> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<empty>";
      }

      @Override
      public <T> Stream<T> a(bak $$0, dcz<T> $$1) {
         return Stream.empty();
      }
   }

   public static record d(jr<cxd> f) implements ddh {
      public static final MapCodec<ddh.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxd.e.fieldOf("item").forGetter(ddh.d::b)).apply($$0, ddh.d::new));
      public static final yn<wa, ddh.d> d = yn.a(cxd.f, ddh.d::b, ddh.d::new);
      public static final ddh.i<ddh.d> e = new ddh.i<>(c, d);

      public d(cxd $$0) {
         this($$0.f());
      }

      @Override
      public ddh.i<ddh.d> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dcz<T> $$1) {
         return $$1 instanceof dcz.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean a(csn $$0) {
         return this.f.a().a($$0);
      }

      public jr<cxd> b() {
         return this.f;
      }
   }

   public static class e implements dcz.b<cxh> {
      public static final ddh.e a = new ddh.e();

      public cxh b(cxh $$0) {
         return $$0;
      }
   }

   public static record f(cxh f) implements ddh {
      public static final MapCodec<ddh.f> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxh.d.fieldOf("item").forGetter(ddh.f::b)).apply($$0, ddh.f::new));
      public static final yn<wa, ddh.f> d = yn.a(cxh.i, ddh.f::b, ddh.f::new);
      public static final ddh.i<ddh.f> e = new ddh.i<>(c, d);

      @Override
      public ddh.i<ddh.f> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dcz<T> $$1) {
         return $$1 instanceof dcz.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof ddh.f $$1 && cxh.a(this.f, $$1.f)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public boolean a(csn $$0) {
         return this.f.h().a($$0);
      }

      public cxh b() {
         return this.f;
      }
   }

   public static record g(ddh f, ddh g, ddh h) implements ddh {
      public static final MapCodec<ddh.g> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ddh.a.fieldOf("base").forGetter(ddh.g::b), ddh.a.fieldOf("material").forGetter(ddh.g::c), ddh.a.fieldOf("pattern").forGetter(ddh.g::d)
               )
               .apply($$0, ddh.g::new)
      );
      public static final yn<wa, ddh.g> d = yn.a(ddh.b, ddh.g::b, ddh.b, ddh.g::c, ddh.b, ddh.g::d, ddh.g::new);
      public static final ddh.i<ddh.g> e = new ddh.i<>(c, d);

      @Override
      public ddh.i<ddh.g> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dcz<T> $$1) {
         if ($$1 instanceof dcz.b<T> $$2) {
            jt.a $$3 = $$0.c(ddi.b);
            if ($$3 != null) {
               azh $$4 = azh.a((long)System.identityHashCode(this));
               List<cxh> $$5 = this.f.a($$0);
               if ($$5.isEmpty()) {
                  return Stream.empty();
               }

               List<cxh> $$6 = this.g.a($$0);
               if ($$6.isEmpty()) {
                  return Stream.empty();
               }

               List<cxh> $$7 = this.h.a($$0);
               if ($$7.isEmpty()) {
                  return Stream.empty();
               }

               return Stream.<cxh>generate(() -> {
                  cxh $$5x = af.a($$5, $$4);
                  cxh $$6x = af.a($$6, $$4);
                  cxh $$7x = af.a($$7, $$4);
                  return dct.a($$3, $$5x, $$6x, $$7x);
               }).limit(256L).filter($$0x -> !$$0x.f()).limit(16L).map($$2::a);
            }
         }

         return Stream.empty();
      }

      public ddh b() {
         return this.f;
      }

      public ddh c() {
         return this.g;
      }

      public ddh d() {
         return this.h;
      }
   }

   public static record h(axf<cxd> f) implements ddh {
      public static final MapCodec<ddh.h> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axf.a(mc.K).fieldOf("tag").forGetter(ddh.h::b)).apply($$0, ddh.h::new)
      );
      public static final yn<wa, ddh.h> d = yn.a(axf.c(mc.K), ddh.h::b, ddh.h::new);
      public static final ddh.i<ddh.h> e = new ddh.i<>(c, d);

      @Override
      public ddh.i<ddh.h> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dcz<T> $$1) {
         if ($$1 instanceof dcz.b<T> $$2) {
            jt.a $$3 = $$0.c(ddi.b);
            if ($$3 != null) {
               return $$3.d(mc.K).a(this.f).map($$1x -> $$1x.a().map($$2::a)).stream().flatMap($$0x -> $$0x);
            }
         }

         return Stream.empty();
      }

      public axf<cxd> b() {
         return this.f;
      }
   }

   public static record i<T extends ddh>(MapCodec<T> a, yn<wa, T> b) {
   }

   public static record j(ddh f, ddh g) implements ddh {
      public static final MapCodec<ddh.j> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ddh.a.fieldOf("input").forGetter(ddh.j::b), ddh.a.fieldOf("remainder").forGetter(ddh.j::c)).apply($$0, ddh.j::new)
      );
      public static final yn<wa, ddh.j> d = yn.a(ddh.b, ddh.j::b, ddh.b, ddh.j::c, ddh.j::new);
      public static final ddh.i<ddh.j> e = new ddh.i<>(c, d);

      @Override
      public ddh.i<ddh.j> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dcz<T> $$1) {
         if ($$1 instanceof dcz.a<T> $$2) {
            List<T> $$3 = this.g.a($$0, $$1).toList();
            return this.f.a($$0, $$1).map($$2x -> $$2.a((T)$$2x, $$3));
         } else {
            return this.f.a($$0, $$1);
         }
      }

      @Override
      public boolean a(csn $$0) {
         return this.f.a($$0) && this.g.a($$0);
      }

      public ddh b() {
         return this.f;
      }

      public ddh c() {
         return this.g;
      }
   }
}
