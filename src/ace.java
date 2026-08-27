import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record ace(int b, int c, int d, List<ace.a> e) implements zb<abm> {
   public static final ys<wf, ace> a = ys.a(yq.f, ace::e, yq.f, ace::f, yq.f, ace::g, ace.a.a.a(yq.a()), ace::h, ace::new);

   public ace(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new ace.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(wx::a))).toList()
      );
   }

   @Override
   public zd<ace> a() {
      return afx.r;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public Suggestions b() {
      StringRange $$0 = StringRange.between(this.c, this.c + this.d);
      return new Suggestions($$0, this.e.stream().map($$1 -> new Suggestion($$0, $$1.a(), $$1.b().orElse(null))).toList());
   }

   public int e() {
      return this.b;
   }

   public int f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public List<ace.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<wu> c) {
      public static final ys<wf, ace.a> a = ys.a(yq.k, ace.a::a, ww.e, ace.a::b, ace.a::new);

      public String a() {
         return this.b;
      }

      public Optional<wu> b() {
         return this.c;
      }
   }
}
