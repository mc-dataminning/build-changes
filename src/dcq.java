import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public interface dcq {
   Codec<dcq> a = mb.aA.q().dispatch(dcq::a, dcq.i::a);
   yn<wa, dcq> b = yl.a(mc.aG).b(dcq::a, dcq.i::b);

   <T> Stream<T> a(bak var1, dci<T> var2);

   dcq.i<? extends dcq> a();

   default boolean a(cru $$0) {
      return true;
   }

   default List<cwq> a(bak $$0) {
      return this.a($$0, dcq.e.a).toList();
   }

   default cwq b(bak $$0) {
      return this.a($$0, dcq.e.a).findFirst().orElse(cwq.j);
   }

   public static class a implements dcq {
      public static final dcq.a c = new dcq.a();
      public static final MapCodec<dcq.a> d = MapCodec.unit(c);
      public static final yn<wa, dcq.a> e = yn.a(c);
      public static final dcq.i<dcq.a> f = new dcq.i<>(d, e);

      private a() {
      }

      @Override
      public dcq.i<dcq.a> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<any fuel>";
      }

      @Override
      public <T> Stream<T> a(bak $$0, dci<T> $$1) {
         if ($$1 instanceof dci.b<T> $$2) {
            duy $$3 = $$0.c(dcr.a);
            if ($$3 != null) {
               return $$3.a().stream().map($$2::a);
            }
         }

         return Stream.empty();
      }
   }

   public static record b(List<dcq> f) implements dcq {
      public static final MapCodec<dcq.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dcq.a.listOf().fieldOf("contents").forGetter(dcq.b::b)).apply($$0, dcq.b::new)
      );
      public static final yn<wa, dcq.b> d = yn.a(dcq.b.a(yl.a()), dcq.b::b, dcq.b::new);
      public static final dcq.i<dcq.b> e = new dcq.i<>(c, d);

      @Override
      public dcq.i<dcq.b> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dci<T> $$1) {
         return this.f.stream().flatMap($$2 -> $$2.a($$0, $$1));
      }

      @Override
      public boolean a(cru $$0) {
         return this.f.stream().allMatch($$1 -> $$1.a($$0));
      }

      public List<dcq> b() {
         return this.f;
      }
   }

   public static class c implements dcq {
      public static final dcq.c c = new dcq.c();
      public static final MapCodec<dcq.c> d = MapCodec.unit(c);
      public static final yn<wa, dcq.c> e = yn.a(c);
      public static final dcq.i<dcq.c> f = new dcq.i<>(d, e);

      private c() {
      }

      @Override
      public dcq.i<dcq.c> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<empty>";
      }

      @Override
      public <T> Stream<T> a(bak $$0, dci<T> $$1) {
         return Stream.empty();
      }
   }

   public static record d(jr<cwm> f) implements dcq {
      public static final MapCodec<dcq.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwm.e.fieldOf("item").forGetter(dcq.d::b)).apply($$0, dcq.d::new));
      public static final yn<wa, dcq.d> d = yn.a(yl.b(mc.K), dcq.d::b, dcq.d::new);
      public static final dcq.i<dcq.d> e = new dcq.i<>(c, d);

      public d(cwm $$0) {
         this($$0.f());
      }

      @Override
      public dcq.i<dcq.d> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dci<T> $$1) {
         return $$1 instanceof dci.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean a(cru $$0) {
         return this.f.a().a($$0);
      }

      public jr<cwm> b() {
         return this.f;
      }
   }

   public static class e implements dci.b<cwq> {
      public static final dcq.e a = new dcq.e();

      public cwq b(cwq $$0) {
         return $$0;
      }
   }

   public static record f(cwq f) implements dcq {
      public static final MapCodec<dcq.f> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwq.c.fieldOf("item").forGetter(dcq.f::b)).apply($$0, dcq.f::new));
      public static final yn<wa, dcq.f> d = yn.a(cwq.h, dcq.f::b, dcq.f::new);
      public static final dcq.i<dcq.f> e = new dcq.i<>(c, d);

      @Override
      public dcq.i<dcq.f> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dci<T> $$1) {
         return $$1 instanceof dci.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof dcq.f $$1 && cwq.a(this.f, $$1.f)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public boolean a(cru $$0) {
         return this.f.h().a($$0);
      }

      public cwq b() {
         return this.f;
      }
   }

   public static record g(dcq f, dcq g, dcq h) implements dcq {
      public static final MapCodec<dcq.g> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dcq.a.fieldOf("base").forGetter(dcq.g::b), dcq.a.fieldOf("material").forGetter(dcq.g::c), dcq.a.fieldOf("pattern").forGetter(dcq.g::d)
               )
               .apply($$0, dcq.g::new)
      );
      public static final yn<wa, dcq.g> d = yn.a(dcq.b, dcq.g::b, dcq.b, dcq.g::c, dcq.b, dcq.g::d, dcq.g::new);
      public static final dcq.i<dcq.g> e = new dcq.i<>(c, d);

      @Override
      public dcq.i<dcq.g> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dci<T> $$1) {
         if ($$1 instanceof dci.b<T> $$2) {
            jt.a $$3 = $$0.c(dcr.b);
            if ($$3 != null) {
               azh $$4 = azh.a((long)System.identityHashCode(this));
               List<cwq> $$5 = this.f.a($$0);
               if ($$5.isEmpty()) {
                  return Stream.empty();
               }

               List<cwq> $$6 = this.g.a($$0);
               if ($$6.isEmpty()) {
                  return Stream.empty();
               }

               List<cwq> $$7 = this.h.a($$0);
               if ($$7.isEmpty()) {
                  return Stream.empty();
               }

               return Stream.<cwq>generate(() -> {
                  cwq $$5x = af.a($$5, $$4);
                  cwq $$6x = af.a($$6, $$4);
                  cwq $$7x = af.a($$7, $$4);
                  return dcd.a($$3, $$5x, $$6x, $$7x);
               }).limit(256L).filter($$0x -> !$$0x.f()).limit(16L).map($$2::a);
            }
         }

         return Stream.empty();
      }

      public dcq b() {
         return this.f;
      }

      public dcq c() {
         return this.g;
      }

      public dcq d() {
         return this.h;
      }
   }

   public static record h(axf<cwm> f) implements dcq {
      public static final MapCodec<dcq.h> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axf.a(mc.K).fieldOf("tag").forGetter(dcq.h::b)).apply($$0, dcq.h::new)
      );
      public static final yn<wa, dcq.h> d = yn.a(axf.c(mc.K), dcq.h::b, dcq.h::new);
      public static final dcq.i<dcq.h> e = new dcq.i<>(c, d);

      @Override
      public dcq.i<dcq.h> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dci<T> $$1) {
         if ($$1 instanceof dci.b<T> $$2) {
            jt.a $$3 = $$0.c(dcr.b);
            if ($$3 != null) {
               return $$3.d(mc.K).a(this.f).map($$1x -> $$1x.a().map($$2::a)).stream().flatMap($$0x -> $$0x);
            }
         }

         return Stream.empty();
      }

      public axf<cwm> b() {
         return this.f;
      }
   }

   public static record i<T extends dcq>(MapCodec<T> a, yn<wa, T> b) {
   }

   public static record j(dcq f, dcq g) implements dcq {
      public static final MapCodec<dcq.j> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dcq.a.fieldOf("input").forGetter(dcq.j::b), dcq.a.fieldOf("remainder").forGetter(dcq.j::c)).apply($$0, dcq.j::new)
      );
      public static final yn<wa, dcq.j> d = yn.a(dcq.b, dcq.j::b, dcq.b, dcq.j::c, dcq.j::new);
      public static final dcq.i<dcq.j> e = new dcq.i<>(c, d);

      @Override
      public dcq.i<dcq.j> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dci<T> $$1) {
         if ($$1 instanceof dci.a<T> $$2) {
            List<T> $$3 = this.g.a($$0, $$1).toList();
            return this.f.a($$0, $$1).map($$2x -> $$2.a((T)$$2x, $$3));
         } else {
            return this.f.a($$0, $$1);
         }
      }

      @Override
      public boolean a(cru $$0) {
         return this.f.a($$0) && this.g.a($$0);
      }

      public dcq b() {
         return this.f;
      }

      public dcq c() {
         return this.g;
      }
   }
}
