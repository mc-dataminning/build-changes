import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class eyh extends eyb {
   public static final MapCodec<eyh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(eyh.b.a.listOf().fieldOf("modifiers").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("replace", true).forGetter($$0x -> $$0x.c))
            )
            .apply($$0, eyh::new)
   );
   private final List<eyh.b> b;
   private final boolean c;

   eyh(List<ezx> $$0, List<eyh.b> $$1, boolean $$2) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eyd<eyh> b() {
      return eye.o;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.stream().flatMap($$0 -> $$0.e.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cxh a(cxh $$0, ewo $$1) {
      if (this.c) {
         $$0.b(kv.o, this.a($$1, czw.a));
      } else {
         $$0.a(kv.o, czw.a, $$1x -> this.a($$1, $$1x));
      }

      return $$0;
   }

   private czw a(ewo $$0, czw $$1) {
      azh $$2 = $$0.b();

      for (eyh.b $$3 : this.b) {
         bvk $$4 = af.a($$3.f, $$2);
         $$1 = $$1.a($$3.c, new bxe($$3.b, (double)$$3.e.b($$0), $$3.d), $$4);
      }

      return $$1;
   }

   public static eyh.c a(aku $$0, jr<bxb> $$1, bxe.a $$2, fat $$3) {
      return new eyh.c($$0, $$1, $$2, $$3);
   }

   public static eyh.a c() {
      return new eyh.a();
   }

   public static class a extends eyb.a<eyh.a> {
      private final boolean a;
      private final List<eyh.b> b = Lists.newArrayList();

      public a(boolean $$0) {
         this.a = $$0;
      }

      public a() {
         this(false);
      }

      protected eyh.a a() {
         return this;
      }

      public eyh.a a(eyh.c $$0) {
         this.b.add($$0.a());
         return this;
      }

      @Override
      public eyc b() {
         return new eyh(this.g(), this.b, this.a);
      }
   }

   static record b(aku b, jr<bxb> c, bxe.a d, fat e, List<bvk> f) {
      private static final Codec<List<bvk>> g = ayi.b(ayi.a(bvk.l));
      public static final Codec<eyh.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aku.a.fieldOf("id").forGetter(eyh.b::a),
                  bxb.a.fieldOf("attribute").forGetter(eyh.b::b),
                  bxe.a.f.fieldOf("operation").forGetter(eyh.b::c),
                  fau.a.fieldOf("amount").forGetter(eyh.b::d),
                  g.fieldOf("slot").forGetter(eyh.b::e)
               )
               .apply($$0, eyh.b::new)
      );

      public aku a() {
         return this.b;
      }

      public jr<bxb> b() {
         return this.c;
      }

      public bxe.a c() {
         return this.d;
      }

      public fat d() {
         return this.e;
      }

      public List<bvk> e() {
         return this.f;
      }
   }

   public static class c {
      private final aku a;
      private final jr<bxb> b;
      private final bxe.a c;
      private final fat d;
      private final Set<bvk> e = EnumSet.noneOf(bvk.class);

      public c(aku $$0, jr<bxb> $$1, bxe.a $$2, fat $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public eyh.c a(bvk $$0) {
         this.e.add($$0);
         return this;
      }

      public eyh.b a() {
         return new eyh.b(this.a, this.b, this.c, this.d, List.copyOf(this.e));
      }
   }
}
