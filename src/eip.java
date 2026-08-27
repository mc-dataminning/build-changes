import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class eip extends eja {
   public static final Codec<eip> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bpf.b(0, 256).fieldOf("count").forGetter($$0x -> $$0x.c), Codec.INT.fieldOf("start_offset").forGetter($$0x -> $$0x.d))
            .apply($$0, eip::new)
   );
   private final bpf c;
   private final int d;

   private eip(bpf $$0, int $$1) {
      this.d = $$1;
      this.c = $$0;
   }

   public static eip a(bpf $$0) {
      return new eip($$0, 0);
   }

   public static eip a(int $$0) {
      return a(bpc.a($$0));
   }

   public static eip a(int $$0, int $$1) {
      return new eip(bpc.a($$0), $$1);
   }

   @Override
   public Stream<ir> a_(eiy $$0, ayt $$1, ir $$2) {
      Builder<ir> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(dyu.a.e, $$7, $$8) + this.d;
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new ir($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public ejb<?> b() {
      return ejb.i;
   }

   private static int a(eiy $$0, int $$1, int $$2, int $$3, int $$4) {
      ir.a $$5 = new ir.a($$1, $$2, $$3);
      int $$6 = 0;
      dtc $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dtc $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(dfe.ak)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dtc $$0) {
      return $$0.i() || $$0.a(dfe.al) || $$0.a(dfe.am);
   }
}
