import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eos extends eox {
   public static final avt<efq> a = avp.l;
   public static final emk.a b = emk.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<eos> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  awu.a(avt.a(ku.aG), "destination", a).forGetter($$0x -> $$0x.h),
                  emk.a.J.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  awu.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  awu.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  awu.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, eos::new)
   );
   private final avt<efq> h;
   private final emk.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   eos(List<eql> $$0, avt<efq> $$1, emk.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public eoz b() {
      return epa.n;
   }

   @Override
   public Set<epu<?>> a() {
      return ImmutableSet.of(epx.f);
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      if (!$$0.a(crv.uh)) {
         return $$0;
      } else {
         esj $$2 = $$1.c(epx.f);
         if ($$2 != null) {
            apu $$3 = $$1.d();
            id $$4 = $$3.a(this.h, id.a($$2), this.k, this.l);
            if ($$4 != null) {
               crs $$5 = crz.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               crz.a($$3, $$5);
               emo.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static eos.a c() {
      return new eos.a();
   }

   public static class a extends eox.a<eos.a> {
      private avt<efq> a;
      private emk.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = eos.a;
         this.b = eos.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected eos.a a() {
         return this;
      }

      public eos.a a(avt<efq> $$0) {
         this.a = $$0;
         return this;
      }

      public eos.a a(emk.a $$0) {
         this.b = $$0;
         return this;
      }

      public eos.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public eos.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public eos.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public eoy b() {
         return new eos(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
