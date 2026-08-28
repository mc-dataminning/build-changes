import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class eze extends eyy {
   public static final MapCodec<eze> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(eze.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, eze::new)
   );
   private final List<eze.b> b;
   private final boolean c;

   eze(List<fau> $$0, List<eze.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eza<eze> b() {
      return ezb.o;
   }

   @Override
   public Set<bat<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      if (this.c) {
         $$0.b(kx.o, this.a($$1, dam.a));
      } else {
         $$0.a(kx.o, dam.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private dam a(exl $$0, dam $$1) {
      azs $$2 = $$0.b();

      for (eze.b $$3 : this.b) {
         bwd $$4 = af.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bxv($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static eze.c a(ald $$0, js<bxs> $$1, bxv.a $$2, fbq $$3) {
      return new eze.c($$0, $$1, $$2, $$3);
   }

   public static eze.a c() {
      return new eze.a();
   }

   public static class a extends eyy.a<eze.a> {
      private final boolean a;
      private final List<eze.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected eze.a a() {
         return this;
      }

      public eze.a a(eze.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public eyz b() {
         return new eze(this.g(), this.b, this.a);
      }
   }

   static record b(ald b, js<bxs> c, bxv.a d, fbq e, List<bwd> f) {
      private static final Codec<List<bwd>> g = ays.b(ays.a(bwd.m));
      public static final Codec<eze.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ald.a.fieldOf("id").forGetter(eze.b::a),
                  bxs.a.fieldOf("attribute").forGetter(eze.b::b),
                  bxv.a.f.fieldOf("operation").forGetter(eze.b::c),
                  fbr.a.fieldOf("amount").forGetter(eze.b::d),
                  g.fieldOf("slot").forGetter(eze.b::e)
               )
               .apply($$0, eze.b::new)
      );

      public ald a() {
         return this.b;
      }

      public js<bxs> b() {
         return this.c;
      }

      public bxv.a c() {
         return this.d;
      }

      public fbq d() {
         return this.e;
      }

      public List<bwd> e() {
         return this.f;
      }
   }

   public static class c {
      private final ald a;
      private final js<bxs> b;
      private final bxv.a c;
      private final fbq d;
      private final Set<bwd> e = EnumSet.noneOf(bwd.class);

      public c(ald $$0, js<bxs> $$1, bxv.a $$2, fbq $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eze.c a(bwd $$0) {
         this.e.add($$0);
         return this;
      }

      public eze.b a() {
         return new eze.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
