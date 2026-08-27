import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class emb extends emg {
   public static final avd<edc> a = auz.l;
   public static final eju.a b = eju.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<emb> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  awe.a(avd.a(kj.aE), "destination", a).forGetter($$0x -> $$0x.h),
                  eju.a.J.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  awe.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  awe.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  awe.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, emb::new)
   );
   private final avd<edc> h;
   private final eju.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   emb(List<ent> $$0, avd<edc> $$1, eju.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public emi b() {
      return emj.m;
   }

   @Override
   public Set<enc<?>> a() {
      return ImmutableSet.of(enf.f);
   }

   @Override
   public cqk a(cqk $$0, eku $$1) {
      if (!$$0.a(cqn.ug)) {
         return $$0;
      } else {
         epr $$2 = $$1.c(enf.f);
         if ($$2 != null) {
            apf $$3 = $$1.d();
            ib $$4 = $$3.a(this.h, ib.a($$2), this.k, this.l);
            if ($$4 != null) {
               cqk $$5 = cqr.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cqr.a($$3, $$5);
               ejy.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static emb.a c() {
      return new emb.a();
   }

   public static class a extends emg.a<emb.a> {
      private avd<edc> a;
      private eju.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = emb.a;
         this.b = emb.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected emb.a a() {
         return this;
      }

      public emb.a a(avd<edc> $$0) {
         this.a = $$0;
         return this;
      }

      public emb.a a(eju.a $$0) {
         this.b = $$0;
         return this;
      }

      public emb.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public emb.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public emb.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public emh b() {
         return new emb(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
