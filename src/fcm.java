import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class fcm extends fcg {
   public static final MapCodec<fcm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(fcm.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, fcm::new)
   );
   private final List<fcm.b> b;
   private final boolean c;

   fcm(List<fec> $$0, List<fcm.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public fci<fcm> b() {
      return fcj.o;
   }

   @Override
   public Set<bbk<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      if (this.c) {
         $$0.b(kl.o, this.a($$1, ddb.a));
      } else {
         $$0.a(kl.o, ddb.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private ddb a(fat $$0, ddb $$1) {
      bai $$2 = $$0.b();

      for (fcm.b $$3 : this.b) {
         bxp $$4 = ag.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bzj($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static fcm.c a(alr $$0, jg<bzg> $$1, bzj.a $$2, fey $$3) {
      return new fcm.c($$0, $$1, $$2, $$3);
   }

   public static fcm.a c() {
      return new fcm.a();
   }

   public static class a extends fcg.a<fcm.a> {
      private final boolean a;
      private final List<fcm.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected fcm.a a() {
         return this;
      }

      public fcm.a a(fcm.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public fch b() {
         return new fcm(this.g(), this.b, this.a);
      }
   }

   static record b(alr b, jg<bzg> c, bzj.a d, fey e, List<bxp> f) {
      private static final Codec<List<bxp>> g = azg.b(azg.a(bxp.m));
      public static final Codec<fcm.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alr.a.fieldOf("id").forGetter(fcm.b::a),
                  bzg.a.fieldOf("attribute").forGetter(fcm.b::b),
                  bzj.a.f.fieldOf("operation").forGetter(fcm.b::c),
                  fez.a.fieldOf("amount").forGetter(fcm.b::d),
                  g.fieldOf("slot").forGetter(fcm.b::e)
               )
               .apply($$0, fcm.b::new)
      );

      public alr a() {
         return this.b;
      }

      public jg<bzg> b() {
         return this.c;
      }

      public bzj.a c() {
         return this.d;
      }

      public fey d() {
         return this.e;
      }

      public List<bxp> e() {
         return this.f;
      }
   }

   public static class c {
      private final alr a;
      private final jg<bzg> b;
      private final bzj.a c;
      private final fey d;
      private final Set<bxp> e = EnumSet.noneOf(bxp.class);

      public c(alr $$0, jg<bzg> $$1, bzj.a $$2, fey $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public fcm.c a(bxp $$0) {
         this.e.add($$0);
         return this;
      }

      public fcm.b a() {
         return new fcm.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
