import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eep extends eeu {
   public static final arh<dwa> a = ard.l;
   public static final ecl.a b = ecl.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<eep> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  asg.a(arh.a(jz.aA), "destination", a).forGetter($$0x -> $$0x.h),
                  ecl.a.I.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  asg.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  asg.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  asg.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, eep::new)
   );
   private final arh<dwa> h;
   private final ecl.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   eep(List<egh> $$0, arh<dwa> $$1, ecl.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public eew b() {
      return eex.m;
   }

   @Override
   public Set<efq<?>> a() {
      return ImmutableSet.of(eft.f);
   }

   @Override
   public ckj a(ckj $$0, edi $$1) {
      if (!$$0.a(ckm.tp)) {
         return $$0;
      } else {
         eif $$2 = $$1.c(eft.f);
         if ($$2 != null) {
            alq $$3 = $$1.d();
            ht $$4 = $$3.a(this.h, ht.a($$2), this.k, this.l);
            if ($$4 != null) {
               ckj $$5 = ckq.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               ckq.a($$3, $$5);
               eco.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static eep.a c() {
      return new eep.a();
   }

   public static class a extends eeu.a<eep.a> {
      private arh<dwa> a;
      private ecl.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = eep.a;
         this.b = eep.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected eep.a a() {
         return this;
      }

      public eep.a a(arh<dwa> $$0) {
         this.a = $$0;
         return this;
      }

      public eep.a a(ecl.a $$0) {
         this.b = $$0;
         return this;
      }

      public eep.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public eep.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public eep.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public eev b() {
         return new eep(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
