import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;

public class aay implements xx<aag> {
   public static final xo<uq, aay> a = xx.a(aay::a, aay::new);
   private final int b;
   private final Suggestions c;

   public aay(int $$0, Suggestions $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aay(uq $$0) {
      this.b = $$0.n();
      int $$1 = $$0.n();
      int $$2 = $$0.n();
      StringRange $$3 = StringRange.between($$1, $$1 + $$2);
      List<Suggestion> $$4 = $$0.a((xp<? super uq, Suggestion>)($$1x -> {
         String $$2x = $$1x.r();
         vq $$3x = $$1x.c(uq::m);
         return new Suggestion($$3, $$2x, $$3x);
      }));
      this.c = new Suggestions($$3, $$4);
   }

   private void a(uq $$0) {
      $$0.c(this.b);
      $$0.c(this.c.getRange().getStart());
      $$0.c(this.c.getRange().getLength());
      $$0.a(this.c.getList(), ($$0x, $$1) -> {
         $$0x.a($$1.getText());
         $$0x.a($$1.getTooltip(), ($$0xx, $$1x) -> $$0xx.a(vt.a($$1x)));
      });
   }

   @Override
   public xz<aay> a() {
      return aeq.r;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public Suggestions e() {
      return this.c;
   }
}
