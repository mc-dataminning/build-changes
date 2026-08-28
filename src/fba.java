import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class fba extends fau {
   public static final MapCodec<fba> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(fba.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, fba::new)
   );
   private final List<fba.b> b;
   private final boolean c;

   fba(List<fcq> $$0, List<fba.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public faw<fba> b() {
      return fax.o;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      if (this.c) {
         $$0.b(kj.o, this.a($$1, dbu.a));
      } else {
         $$0.a(kj.o, dbu.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private dbu a(ezh $$0, dbu $$1) {
      azv $$2 = $$0.b();

      for (fba.b $$3 : this.b) {
         bwq $$4 = af.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new byi($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static fba.c a(alg $$0, je<byf> $$1, byi.a $$2, fdm $$3) {
      return new fba.c($$0, $$1, $$2, $$3);
   }

   public static fba.a c() {
      return new fba.a();
   }

   public static class a extends fau.a<fba.a> {
      private final boolean a;
      private final List<fba.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected fba.a a() {
         return this;
      }

      public fba.a a(fba.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public fav b() {
         return new fba(this.g(), this.b, this.a);
      }
   }

   static record b(alg b, je<byf> c, byi.a d, fdm e, List<bwq> f) {
      private static final Codec<List<bwq>> g = ayu.b(ayu.a(bwq.m));
      public static final Codec<fba.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alg.a.fieldOf("id").forGetter(fba.b::a),
                  byf.a.fieldOf("attribute").forGetter(fba.b::b),
                  byi.a.f.fieldOf("operation").forGetter(fba.b::c),
                  fdn.a.fieldOf("amount").forGetter(fba.b::d),
                  g.fieldOf("slot").forGetter(fba.b::e)
               )
               .apply($$0, fba.b::new)
      );

      public alg a() {
         return this.b;
      }

      public je<byf> b() {
         return this.c;
      }

      public byi.a c() {
         return this.d;
      }

      public fdm d() {
         return this.e;
      }

      public List<bwq> e() {
         return this.f;
      }
   }

   public static class c {
      private final alg a;
      private final je<byf> b;
      private final byi.a c;
      private final fdm d;
      private final Set<bwq> e = EnumSet.noneOf(bwq.class);

      public c(alg $$0, je<byf> $$1, byi.a $$2, fdm $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public fba.c a(bwq $$0) {
         this.e.add($$0);
         return this;
      }

      public fba.b a() {
         return new fba.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
