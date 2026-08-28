import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class exl extends exf {
   public static final MapCodec<exl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(exl.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, exl::new)
   );
   private final List<exl.b> b;
   private final boolean c;

   exl(List<ezb> $$0, List<exl.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public exh<exl> b() {
      return exi.o;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      if (this.c) {
         $$0.b(kv.o, this.a($$1, czh.a));
      } else {
         $$0.a(kv.o, czh.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private czh a(evs $$0, czh $$1) {
      azh $$2 = $$0.b();

      for (exl.b $$3 : this.b) {
         buv $$4 = af.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bwo($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static exl.c a(akv $$0, jr<bwl> $$1, bwo.a $$2, ezx $$3) {
      return new exl.c($$0, $$1, $$2, $$3);
   }

   public static exl.a c() {
      return new exl.a();
   }

   public static class a extends exf.a<exl.a> {
      private final boolean a;
      private final List<exl.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected exl.a a() {
         return this;
      }

      public exl.a a(exl.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public exg b() {
         return new exl(this.g(), this.b, this.a);
      }
   }

   static record b(akv b, jr<bwl> c, bwo.a d, ezx e, List<buv> f) {
      private static final Codec<List<buv>> g = ayi.b(ayi.a(buv.l));
      public static final Codec<exl.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akv.a.fieldOf("id").forGetter(exl.b::a),
                  bwl.a.fieldOf("attribute").forGetter(exl.b::b),
                  bwo.a.f.fieldOf("operation").forGetter(exl.b::c),
                  ezy.a.fieldOf("amount").forGetter(exl.b::d),
                  g.fieldOf("slot").forGetter(exl.b::e)
               )
               .apply($$0, exl.b::new)
      );

      public akv a() {
         return this.b;
      }

      public jr<bwl> b() {
         return this.c;
      }

      public bwo.a c() {
         return this.d;
      }

      public ezx d() {
         return this.e;
      }

      public List<buv> e() {
         return this.f;
      }
   }

   public static class c {
      private final akv a;
      private final jr<bwl> b;
      private final bwo.a c;
      private final ezx d;
      private final Set<buv> e = EnumSet.noneOf(buv.class);

      public c(akv $$0, jr<bwl> $$1, bwo.a $$2, ezx $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public exl.c a(buv $$0) {
         this.e.add($$0);
         return this;
      }

      public exl.b a() {
         return new exl.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
