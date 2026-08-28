import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public interface dcp {
   Codec<dcp> a = mb.aA.q().dispatch(dcp::a, dcp.i::a);
   yn<wa, dcp> b = yl.a(mc.aG).b(dcp::a, dcp.i::b);

   <T> Stream<T> a(bak var1, dch<T> var2);

   dcp.i<? extends dcp> a();

   default boolean a(crt $$0) {
      return true;
   }

   default List<cwp> a(bak $$0) {
      return this.a($$0, dcp.e.a).toList();
   }

   default cwp b(bak $$0) {
      return this.a($$0, dcp.e.a).findFirst().orElse(cwp.j);
   }

   public static class a implements dcp {
      public static final dcp.a c = new dcp.a();
      public static final MapCodec<dcp.a> d = MapCodec.unit(c);
      public static final yn<wa, dcp.a> e = yn.a(c);
      public static final dcp.i<dcp.a> f = new dcp.i<>(d, e);

      private a() {
      }

      @Override
      public dcp.i<dcp.a> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<any fuel>";
      }

      @Override
      public <T> Stream<T> a(bak $$0, dch<T> $$1) {
         if ($$1 instanceof dch.b<T> $$2) {
            dux $$3 = $$0.c(dcq.a);
            if ($$3 != null) {
               return $$3.a().stream().map($$2::a);
            }
         }

         return Stream.empty();
      }
   }

   public static record b(List<dcp> f) implements dcp {
      public static final MapCodec<dcp.b> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dcp.a.listOf().fieldOf("contents").forGetter(dcp.b::b)).apply($$0, dcp.b::new)
      );
      public static final yn<wa, dcp.b> d = yn.a(dcp.b.a(yl.a()), dcp.b::b, dcp.b::new);
      public static final dcp.i<dcp.b> e = new dcp.i<>(c, d);

      @Override
      public dcp.i<dcp.b> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dch<T> $$1) {
         return this.f.stream().flatMap($$2 -> $$2.a($$0, $$1));
      }

      @Override
      public boolean a(crt $$0) {
         return this.f.stream().allMatch($$1 -> $$1.a($$0));
      }

      public List<dcp> b() {
         return this.f;
      }
   }

   public static class c implements dcp {
      public static final dcp.c c = new dcp.c();
      public static final MapCodec<dcp.c> d = MapCodec.unit(c);
      public static final yn<wa, dcp.c> e = yn.a(c);
      public static final dcp.i<dcp.c> f = new dcp.i<>(d, e);

      private c() {
      }

      @Override
      public dcp.i<dcp.c> a() {
         return f;
      }

      @Override
      public String toString() {
         return "<empty>";
      }

      @Override
      public <T> Stream<T> a(bak $$0, dch<T> $$1) {
         return Stream.empty();
      }
   }

   public static record d(jr<cwl> f) implements dcp {
      public static final MapCodec<dcp.d> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwl.e.fieldOf("item").forGetter(dcp.d::b)).apply($$0, dcp.d::new));
      public static final yn<wa, dcp.d> d = yn.a(yl.b(mc.K), dcp.d::b, dcp.d::new);
      public static final dcp.i<dcp.d> e = new dcp.i<>(c, d);

      public d(cwl $$0) {
         this($$0.f());
      }

      @Override
      public dcp.i<dcp.d> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dch<T> $$1) {
         return $$1 instanceof dch.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean a(crt $$0) {
         return this.f.a().a($$0);
      }

      public jr<cwl> b() {
         return this.f;
      }
   }

   public static class e implements dch.b<cwp> {
      public static final dcp.e a = new dcp.e();

      public cwp b(cwp $$0) {
         return $$0;
      }
   }

   public static record f(cwp f) implements dcp {
      public static final MapCodec<dcp.f> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwp.c.fieldOf("item").forGetter(dcp.f::b)).apply($$0, dcp.f::new));
      public static final yn<wa, dcp.f> d = yn.a(cwp.h, dcp.f::b, dcp.f::new);
      public static final dcp.i<dcp.f> e = new dcp.i<>(c, d);

      @Override
      public dcp.i<dcp.f> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dch<T> $$1) {
         return $$1 instanceof dch.b<T> $$2 ? Stream.of($$2.a(this.f)) : Stream.empty();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            if ($$0 instanceof dcp.f $$1 && cwp.a(this.f, $$1.f)) {
               return true;
            }

            return false;
         }
      }

      @Override
      public boolean a(crt $$0) {
         return this.f.h().a($$0);
      }

      public cwp b() {
         return this.f;
      }
   }

   public static record g(dcp f, dcp g, dcp h) implements dcp {
      public static final MapCodec<dcp.g> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  dcp.a.fieldOf("base").forGetter(dcp.g::b), dcp.a.fieldOf("material").forGetter(dcp.g::c), dcp.a.fieldOf("pattern").forGetter(dcp.g::d)
               )
               .apply($$0, dcp.g::new)
      );
      public static final yn<wa, dcp.g> d = yn.a(dcp.b, dcp.g::b, dcp.b, dcp.g::c, dcp.b, dcp.g::d, dcp.g::new);
      public static final dcp.i<dcp.g> e = new dcp.i<>(c, d);

      @Override
      public dcp.i<dcp.g> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dch<T> $$1) {
         if ($$1 instanceof dch.b<T> $$2) {
            jt.a $$3 = $$0.c(dcq.b);
            if ($$3 != null) {
               azh $$4 = azh.a((long)System.identityHashCode(this));
               List<cwp> $$5 = this.f.a($$0);
               if ($$5.isEmpty()) {
                  return Stream.empty();
               }

               List<cwp> $$6 = this.g.a($$0);
               if ($$6.isEmpty()) {
                  return Stream.empty();
               }

               List<cwp> $$7 = this.h.a($$0);
               if ($$7.isEmpty()) {
                  return Stream.empty();
               }

               return Stream.<cwp>generate(() -> {
                  cwp $$5x = af.a($$5, $$4);
                  cwp $$6x = af.a($$6, $$4);
                  cwp $$7x = af.a($$7, $$4);
                  return dcc.a($$3, $$5x, $$6x, $$7x);
               }).limit(256L).filter($$0x -> !$$0x.f()).limit(16L).map($$2::a);
            }
         }

         return Stream.empty();
      }

      public dcp b() {
         return this.f;
      }

      public dcp c() {
         return this.g;
      }

      public dcp d() {
         return this.h;
      }
   }

   public static record h(axf<cwl> f) implements dcp {
      public static final MapCodec<dcp.h> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(axf.a(mc.K).fieldOf("tag").forGetter(dcp.h::b)).apply($$0, dcp.h::new)
      );
      public static final yn<wa, dcp.h> d = yn.a(axf.c(mc.K), dcp.h::b, dcp.h::new);
      public static final dcp.i<dcp.h> e = new dcp.i<>(c, d);

      @Override
      public dcp.i<dcp.h> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dch<T> $$1) {
         if ($$1 instanceof dch.b<T> $$2) {
            jt.a $$3 = $$0.c(dcq.b);
            if ($$3 != null) {
               return $$3.d(mc.K).a(this.f).map($$1x -> $$1x.a().map($$2::a)).stream().flatMap($$0x -> $$0x);
            }
         }

         return Stream.empty();
      }

      public axf<cwl> b() {
         return this.f;
      }
   }

   public static record i<T extends dcp>(MapCodec<T> a, yn<wa, T> b) {
   }

   public static record j(dcp f, dcp g) implements dcp {
      public static final MapCodec<dcp.j> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(dcp.a.fieldOf("input").forGetter(dcp.j::b), dcp.a.fieldOf("remainder").forGetter(dcp.j::c)).apply($$0, dcp.j::new)
      );
      public static final yn<wa, dcp.j> d = yn.a(dcp.b, dcp.j::b, dcp.b, dcp.j::c, dcp.j::new);
      public static final dcp.i<dcp.j> e = new dcp.i<>(c, d);

      @Override
      public dcp.i<dcp.j> a() {
         return e;
      }

      @Override
      public <T> Stream<T> a(bak $$0, dch<T> $$1) {
         if ($$1 instanceof dch.a<T> $$2) {
            List<T> $$3 = this.g.a($$0, $$1).toList();
            return this.f.a($$0, $$1).map($$2x -> $$2.a((T)$$2x, $$3));
         } else {
            return this.f.a($$0, $$1);
         }
      }

      @Override
      public boolean a(crt $$0) {
         return this.f.a($$0) && this.g.a($$0);
      }

      public dcp b() {
         return this.f;
      }

      public dcp c() {
         return this.g;
      }
   }
}
