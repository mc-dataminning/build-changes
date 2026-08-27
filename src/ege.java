import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ege extends egj {
   public static final arv<dxh> a = arr.l;
   public static final edz.a b = edz.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<ege> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  asu.a(arv.a(jz.aB), "destination", a).forGetter($$0x -> $$0x.h),
                  edz.a.I.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  asu.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  asu.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  asu.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, ege::new)
   );
   private final arv<dxh> h;
   private final edz.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   ege(List<ehw> $$0, arv<dxh> $$1, edz.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public egl b() {
      return egm.m;
   }

   @Override
   public Set<ehf<?>> a() {
      return ImmutableSet.of(ehi.f);
   }

   @Override
   public clj a(clj $$0, eex $$1) {
      if (!$$0.a(clm.ub)) {
         return $$0;
      } else {
         eju $$2 = $$1.c(ehi.f);
         if ($$2 != null) {
            ame $$3 = $$1.d();
            ht $$4 = $$3.a(this.h, ht.a($$2), this.k, this.l);
            if ($$4 != null) {
               clj $$5 = clq.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               clq.a($$3, $$5);
               eec.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static ege.a c() {
      return new ege.a();
   }

   public static class a extends egj.a<ege.a> {
      private arv<dxh> a;
      private edz.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = ege.a;
         this.b = ege.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected ege.a a() {
         return this;
      }

      public ege.a a(arv<dxh> $$0) {
         this.a = $$0;
         return this;
      }

      public ege.a a(edz.a $$0) {
         this.b = $$0;
         return this;
      }

      public ege.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public ege.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public ege.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public egk b() {
         return new ege(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
