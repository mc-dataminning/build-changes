import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eqc extends epz {
   public static final MapCodec<eqc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(awm.a(lf.G).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, eqc::new)
   );
   private final awm<ctl> j;
   private final boolean k;

   private eqc(awm<ctl> $$0, boolean $$1, int $$2, int $$3, List<esn> $$4, List<eqt> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public epy a() {
      return epv.f;
   }

   @Override
   public void a(Consumer<ctq> $$0, eph $$1) {
      le.h.c(this.j).forEach($$1x -> $$0.accept(new ctq($$1x)));
   }

   private boolean a(eph $$0, Consumer<epw> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final ix<ctl> $$2 : le.h.c(this.j)) {
            $$1.accept(new epz.c() {
               @Override
               public void a(Consumer<ctq> $$0, eph $$1) {
                  $$0.accept(new ctq($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(eph $$0, Consumer<epw> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static epz.a<?> a(awm<ctl> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqc($$0, false, $$1, $$2, $$3, $$4));
   }

   public static epz.a<?> b(awm<ctl> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eqc($$0, true, $$1, $$2, $$3, $$4));
   }
}
