import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eyr extends eyy {
   public static final axp<epg> a = axl.l;
   public static final js<ewi> b = ewj.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<eyr> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axp.a(me.aZ).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  ewi.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, eyr::new)
   );
   private final axp<epg> h;
   private final js<ewi> i;
   private final byte j;
   private final int k;
   private final boolean l;

   eyr(List<fau> $$0, axp<epg> $$1, js<ewi> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public eza<eyr> b() {
      return ezb.q;
   }

   @Override
   public Set<bat<?>> a() {
      return Set.of(faf.f);
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      if (!$$0.a(cyc.vm)) {
         return $$0;
      } else {
         fcu $$2 = $$1.c(faf.f);
         if ($$2 != null) {
            arn $$3 = $$1.d();
            jj $$4 = $$3.a(this.h, jj.a((kc)$$2), this.k, this.l);
            if ($$4 != null) {
               cxy $$5 = cyl.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cyl.a($$3, $$5);
               ewn.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static eyr.a c() {
      return new eyr.a();
   }

   public static class a extends eyy.a<eyr.a> {
      private axp<epg> a;
      private js<ewi> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = eyr.a;
         this.b = eyr.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected eyr.a a() {
         return this;
      }

      public eyr.a a(axp<epg> $$0) {
         this.a = $$0;
         return this;
      }

      public eyr.a a(js<ewi> $$0) {
         this.b = $$0;
         return this;
      }

      public eyr.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public eyr.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public eyr.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public eyz b() {
         return new eyr(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
