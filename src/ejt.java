import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ejt extends ejq {
   public static final Codec<ejt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(auo.a(kg.F).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, ejt::new)
   );
   private final auo<cou> j;
   private final boolean k;

   private ejt(auo<cou> $$0, boolean $$1, int $$2, int $$3, List<elu> $$4, List<eki> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public ejp a() {
      return ejm.f;
   }

   @Override
   public void a(Consumer<coz> $$0, eiv $$1) {
      kf.h.c(this.j).forEach($$1x -> $$0.accept(new coz($$1x)));
   }

   private boolean a(eiv $$0, Consumer<ejn> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final ij<cou> $$2 : kf.h.c(this.j)) {
            $$1.accept(new ejq.c() {
               @Override
               public void a(Consumer<coz> $$0, eiv $$1) {
                  $$0.accept(new coz($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(eiv $$0, Consumer<ejn> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static ejq.a<?> a(auo<cou> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ejt($$0, false, $$1, $$2, $$3, $$4));
   }

   public static ejq.a<?> b(auo<cou> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ejt($$0, true, $$1, $$2, $$3, $$4));
   }
}
