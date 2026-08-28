import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;

public interface ddi {
   Codec<ddi> a = ma.aA.q().dispatch(ddi::a, ddi.j::a);
   zt<xg, ddi> b = zr.a(mb.aG).b(ddi::a, ddi.j::b);

   void a(ddi.f var1, ddi.g var2);

   ddi.j<? extends ddi> a();

   default boolean a(cso $$0) {
      return true;
   }

   default void a(ddi.f $$0, final Consumer<cxk> $$1) {
      this.a($$0, new ddi.g() {
         @Override
         public void a(jq<cxg> $$0) {
            $$1.accept(new cxk($$0));
         }

         @Override
         public void a(cxg $$0) {
            $$1.accept(new cxk($$0));
         }

         @Override
         public void a(cxk $$0) {
            $$1.accept($$0);
         }
      });
   }

   default List<cxk> a(ddi.f $$0) {
      List<cxk> $$1 = new ArrayList<>();
      this.a($$0, $$1::add);
      return $$1;
   }

   default cxk b(ddi.f $$0) {
      MutableObject<cxk> $$1 = new MutableObject(cxk.k);
      this.a($$0, $$1x -> {
         if (!$$1x.f() && ((cxk)$$1.getValue()).f()) {
            $$1.setValue($$1x);
         }
      });
      return (cxk)$$1.getValue();
   }

   public static class a implements ddi {
      public static final ddi.a c = new ddi.a();
      public static final MapCodec<ddi.a> d = MapCodec.unit(c);
      public static final zt<xg, ddi.a> e = zt.a(c);
      public static final ddi.j<ddi.a> f = new ddi.j<>(d, e);

      private a() {
      }

      @Override
      public ddi.j<ddi.a> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<any fuel>";
      }

      @Override
      public void a(ddi.f $$0, ddi.g $$1) {
         $$0.a().a().forEach($$1::a);
      }
   }

   public static record b(List<ddi> f) implements ddi {
      public static final MapCodec<ddi.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ddi.a.listOf().fieldOf("contents").forGetter(ddi.b::b)).apply($$0, ddi.b::new)
      );
      public static final zt<xg, ddi.b> d = zt.a(ddi.b.a(zr.a()), ddi.b::b, ddi.b::new);
      public static final ddi.j<ddi.b> e = new ddi.j<>(c, d);

      @Override
      public ddi.j<ddi.b> a() {
         return e;
      }

      @Override
      public void a(ddi.f $$0, ddi.g $$1) {
         this.f.forEach($$2 -> $$2.a($$0, $$1));
      }

      @Override
      public boolean a(cso $$0) {
         return this.f.stream().allMatch($$1 -> $$1.a($$0));
      }

      public List<ddi> b() {
         return this.f;
      }
   }

   public static class c implements ddi {
      public static final ddi.c c = new ddi.c();
      public static final MapCodec<ddi.c> d = MapCodec.unit(c);
      public static final zt<xg, ddi.c> e = zt.a(c);
      public static final ddi.j<ddi.c> f = new ddi.j<>(d, e);

      private c() {
      }

      @Override
      public ddi.j<ddi.c> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<empty>";
      }

      @Override
      public void a(ddi.f $$0, ddi.g $$1) {
      }
   }

   public static record d(jq<cxg> f) implements ddi {
      public static final MapCodec<ddi.d> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alw.a(mb.K).fieldOf("item").forGetter(ddi.d::b)).apply($$0, ddi.d::new)
      );
      public static final zt<xg, ddi.d> d = zt.a(zr.b(mb.K), ddi.d::b, ddi.d::new);
      public static final ddi.j<ddi.d> e = new ddi.j<>(c, d);

      public d(cxg $$0) {
         this($$0.f());
      }

      @Override
      public ddi.j<ddi.d> a() {
         return e;
      }

      @Override
      public void a(ddi.f $$0, ddi.g $$1) {
         $$1.a(this.f);
      }

      @Override
      public boolean a(cso $$0) {
         return this.f.a().a($$0);
      }

      public jq<cxg> b() {
         return this.f;
      }
   }

   public static record e(cxk f) implements ddi {
      public static final MapCodec<ddi.e> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxk.d.fieldOf("item").forGetter(ddi.e::b)).apply($$0, ddi.e::new));
      public static final zt<xg, ddi.e> d = zt.a(cxk.i, ddi.e::b, ddi.e::new);
      public static final ddi.j<ddi.e> e = new ddi.j<>(c, d);

      @Override
      public ddi.j<ddi.e> a() {
         return e;
      }

      @Override
      public void a(ddi.f $$0, ddi.g $$1) {
         $$1.a(this.f);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof ddi.e $$1 && cxk.a(this.f, $$1.f)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public boolean a(cso $$0) {
         return this.f.h().a($$0);
      }

      public cxk b() {
         return this.f;
      }
   }

   public interface f {
      dvn a();

      js.a b();

      static ddi.f a(final dha $$0) {
         return new ddi.f() {
            @Override
            public dvn a() {
               return $$0.L();
            }

            @Override
            public js.a b() {
               return $$0.K_();
            }
         };
      }
   }

   public interface g {
      void a(jq<cxg> var1);

      void a(cxg var1);

      void a(cxk var1);
   }

   public static class h implements ddi {
      public static final ddi.h c = new ddi.h();
      public static final MapCodec<ddi.h> d = MapCodec.unit(c);
      public static final zt<xg, ddi.h> e = zt.a(c);
      public static final ddi.j<ddi.h> f = new ddi.j<>(d, e);

      private h() {
      }

      @Override
      public ddi.j<ddi.h> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<smithing trim demo>";
      }

      @Override
      public void a(ddi.f $$0, ddi.g $$1) {
         Optional<jq.c<dfr>> $$2 = $$0.b().d(mb.aZ).c().findFirst();
         Optional<jq.c<dfp>> $$3 = $$0.b().d(mb.aY).a(dfq.d);
         if ($$2.isPresent() && $$3.isPresent()) {
            cxk $$4 = new cxk(cxo.qd);
            $$4.b(ku.U, new dfo($$3.get(), $$2.get()));
            $$1.a($$4);
         }
      }
   }

   public static record i(ayk<cxg> f) implements ddi {
      public static final MapCodec<ddi.i> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ayk.a(mb.K).fieldOf("tag").forGetter(ddi.i::b)).apply($$0, ddi.i::new)
      );
      public static final zt<xg, ddi.i> d = zt.a(ayk.c(mb.K), ddi.i::b, ddi.i::new);
      public static final ddi.j<ddi.i> e = new ddi.j<>(c, d);

      @Override
      public ddi.j<ddi.i> a() {
         return e;
      }

      @Override
      public void a(ddi.f $$0, ddi.g $$1) {
         $$0.b().d(mb.K).a(this.f).ifPresent($$1x -> $$1x.forEach($$1::a));
      }

      public ayk<cxg> b() {
         return this.f;
      }
   }

   public static record j<T extends ddi>(MapCodec<T> a, zt<xg, T> b) {
   }
}
