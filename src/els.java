import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class els extends elp {
   public static final Codec<els> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avd.a(kj.F).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, els::new)
   );
   private final avd<cqf> j;
   private final boolean k;

   private els(avd<cqf> $$0, boolean $$1, int $$2, int $$3, List<ent> $$4, List<emh> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public elo a() {
      return ell.f;
   }

   @Override
   public void a(Consumer<cqk> $$0, eku $$1) {
      ki.h.c(this.j).forEach($$1x -> $$0.accept(new cqk($$1x)));
   }

   private boolean a(eku $$0, Consumer<elm> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final il<cqf> $$2 : ki.h.c(this.j)) {
            $$1.accept(new elp.c() {
               @Override
               public void a(Consumer<cqk> $$0, eku $$1) {
                  $$0.accept(new cqk($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(eku $$0, Consumer<elm> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static elp.a<?> a(avd<cqf> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new els($$0, false, $$1, $$2, $$3, $$4));
   }

   public static elp.a<?> b(avd<cqf> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new els($$0, true, $$1, $$2, $$3, $$4));
   }
}
