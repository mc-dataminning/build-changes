import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class exk extends exe {
   public static final MapCodec<exk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(exk.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, exk::new)
   );
   private final List<exk.b> b;
   private final boolean c;

   exk(List<eza> $$0, List<exk.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public exg<exk> b() {
      return exh.o;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      if (this.c) {
         $$0.b(kv.o, this.a($$1, czg.a));
      } else {
         $$0.a(kv.o, czg.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private czg a(evr $$0, czg $$1) {
      azh $$2 = $$0.b();

      for (exk.b $$3 : this.b) {
         buu $$4 = af.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bwn($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static exk.c a(akv $$0, jr<bwk> $$1, bwn.a $$2, ezw $$3) {
      return new exk.c($$0, $$1, $$2, $$3);
   }

   public static exk.a c() {
      return new exk.a();
   }

   public static class a extends exe.a<exk.a> {
      private final boolean a;
      private final List<exk.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected exk.a a() {
         return this;
      }

      public exk.a a(exk.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public exf b() {
         return new exk(this.g(), this.b, this.a);
      }
   }

   static record b(akv b, jr<bwk> c, bwn.a d, ezw e, List<buu> f) {
      private static final Codec<List<buu>> g = ayi.b(ayi.a(buu.l));
      public static final Codec<exk.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akv.a.fieldOf("id").forGetter(exk.b::a),
                  bwk.a.fieldOf("attribute").forGetter(exk.b::b),
                  bwn.a.f.fieldOf("operation").forGetter(exk.b::c),
                  ezx.a.fieldOf("amount").forGetter(exk.b::d),
                  g.fieldOf("slot").forGetter(exk.b::e)
               )
               .apply($$0, exk.b::new)
      );

      public akv a() {
         return this.b;
      }

      public jr<bwk> b() {
         return this.c;
      }

      public bwn.a c() {
         return this.d;
      }

      public ezw d() {
         return this.e;
      }

      public List<buu> e() {
         return this.f;
      }
   }

   public static class c {
      private final akv a;
      private final jr<bwk> b;
      private final bwn.a c;
      private final ezw d;
      private final Set<buu> e = EnumSet.noneOf(buu.class);

      public c(akv $$0, jr<bwk> $$1, bwn.a $$2, ezw $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public exk.c a(buu $$0) {
         this.e.add($$0);
         return this;
      }

      public exk.b a() {
         return new exk.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
