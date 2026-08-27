import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ehu extends ehr {
   public static final Codec<ehu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asw.a(ke.F).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, ehu::new)
   );
   private final asw<cmt> j;
   private final boolean k;

   private ehu(asw<cmt> $$0, boolean $$1, int $$2, int $$3, List<ejv> $$4, List<eij> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public ehq a() {
      return ehn.f;
   }

   @Override
   public void a(Consumer<cmy> $$0, egw $$1) {
      kd.h.c(this.j).forEach($$1x -> $$0.accept(new cmy($$1x)));
   }

   private boolean a(egw $$0, Consumer<eho> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final ih<cmt> $$2 : kd.h.c(this.j)) {
            $$1.accept(new ehr.c() {
               @Override
               public void a(Consumer<cmy> $$0, egw $$1) {
                  $$0.accept(new cmy($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(egw $$0, Consumer<eho> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static ehr.a<?> a(asw<cmt> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ehu($$0, false, $$1, $$2, $$3, $$4));
   }

   public static ehr.a<?> b(asw<cmt> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ehu($$0, true, $$1, $$2, $$3, $$4));
   }
}
