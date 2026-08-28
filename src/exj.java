import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class exj extends exd {
   public static final MapCodec<exj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(exj.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, exj::new)
   );
   private final List<exj.b> b;
   private final boolean c;

   exj(List<eyz> $$0, List<exj.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public exf<exj> b() {
      return exg.o;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      if (this.c) {
         $$0.b(kv.o, this.a($$1, czf.a));
      } else {
         $$0.a(kv.o, czf.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private czf a(evq $$0, czf $$1) {
      azh $$2 = $$0.b();

      for (exj.b $$3 : this.b) {
         but $$4 = af.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bwm($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static exj.c a(akv $$0, jr<bwj> $$1, bwm.a $$2, ezv $$3) {
      return new exj.c($$0, $$1, $$2, $$3);
   }

   public static exj.a c() {
      return new exj.a();
   }

   public static class a extends exd.a<exj.a> {
      private final boolean a;
      private final List<exj.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected exj.a a() {
         return this;
      }

      public exj.a a(exj.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public exe b() {
         return new exj(this.g(), this.b, this.a);
      }
   }

   static record b(akv b, jr<bwj> c, bwm.a d, ezv e, List<but> f) {
      private static final Codec<List<but>> g = ayi.b(ayi.a(but.l));
      public static final Codec<exj.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akv.a.fieldOf("id").forGetter(exj.b::a),
                  bwj.a.fieldOf("attribute").forGetter(exj.b::b),
                  bwm.a.f.fieldOf("operation").forGetter(exj.b::c),
                  ezw.a.fieldOf("amount").forGetter(exj.b::d),
                  g.fieldOf("slot").forGetter(exj.b::e)
               )
               .apply($$0, exj.b::new)
      );

      public akv a() {
         return this.b;
      }

      public jr<bwj> b() {
         return this.c;
      }

      public bwm.a c() {
         return this.d;
      }

      public ezv d() {
         return this.e;
      }

      public List<but> e() {
         return this.f;
      }
   }

   public static class c {
      private final akv a;
      private final jr<bwj> b;
      private final bwm.a c;
      private final ezv d;
      private final Set<but> e = EnumSet.noneOf(but.class);

      public c(akv $$0, jr<bwj> $$1, bwm.a $$2, ezv $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public exj.c a(but $$0) {
         this.e.add($$0);
         return this;
      }

      public exj.b a() {
         return new exj.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
