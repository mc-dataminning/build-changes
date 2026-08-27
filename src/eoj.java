import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eoj extends eoo {
   public static final avr<efh> a = avn.l;
   public static final emb.a b = emb.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<eoj> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aws.a(avr.a(ks.aF), "destination", a).forGetter($$0x -> $$0x.h),
                  emb.a.J.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  aws.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  aws.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  aws.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, eoj::new)
   );
   private final avr<efh> h;
   private final emb.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   eoj(List<eqc> $$0, avr<efh> $$1, emb.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public eoq b() {
      return eor.n;
   }

   @Override
   public Set<epl<?>> a() {
      return ImmutableSet.of(epo.f);
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      if (!$$0.a(crm.uh)) {
         return $$0;
      } else {
         esa $$2 = $$1.c(epo.f);
         if ($$2 != null) {
            aps $$3 = $$1.d();
            ib $$4 = $$3.a(this.h, ib.a($$2), this.k, this.l);
            if ($$4 != null) {
               crj $$5 = crq.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               crq.a($$3, $$5);
               emf.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static eoj.a c() {
      return new eoj.a();
   }

   public static class a extends eoo.a<eoj.a> {
      private avr<efh> a;
      private emb.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = eoj.a;
         this.b = eoj.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected eoj.a a() {
         return this;
      }

      public eoj.a a(avr<efh> $$0) {
         this.a = $$0;
         return this;
      }

      public eoj.a a(emb.a $$0) {
         this.b = $$0;
         return this;
      }

      public eoj.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public eoj.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public eoj.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public eop b() {
         return new eoj(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
