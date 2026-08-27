import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ekw extends ekt {
   public static final Codec<ekw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aut.a(ki.F).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, ekw::new)
   );
   private final aut<cpl> j;
   private final boolean k;

   private ekw(aut<cpl> $$0, boolean $$1, int $$2, int $$3, List<emx> $$4, List<ell> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public eks a() {
      return ekp.f;
   }

   @Override
   public void a(Consumer<cpq> $$0, ejy $$1) {
      kh.h.c(this.j).forEach($$1x -> $$0.accept(new cpq($$1x)));
   }

   private boolean a(ejy $$0, Consumer<ekq> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final il<cpl> $$2 : kh.h.c(this.j)) {
            $$1.accept(new ekt.c() {
               @Override
               public void a(Consumer<cpq> $$0, ejy $$1) {
                  $$0.accept(new cpq($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(ejy $$0, Consumer<ekq> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static ekt.a<?> a(aut<cpl> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ekw($$0, false, $$1, $$2, $$3, $$4));
   }

   public static ekt.a<?> b(aut<cpl> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ekw($$0, true, $$1, $$2, $$3, $$4));
   }
}
