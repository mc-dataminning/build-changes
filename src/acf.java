import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record acf(int b, int c, int d, List<acf.a> e) implements zb<abn> {
   public static final ys<wf, acf> a = ys.a(yq.g, acf::e, yq.g, acf::f, yq.g, acf::g, acf.a.a.a(yq.a()), acf::h, acf::new);

   public acf(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new acf.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(wx::a))).toList()
      );
   }

   @Override
   public zd<acf> a() {
      return afz.r;
   }

   public void a(abn $$0) {
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

   public List<acf.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<wu> c) {
      public static final ys<wf, acf.a> a = ys.a(yq.l, acf.a::a, ww.e, acf.a::b, acf.a::new);

      public String a() {
         return this.b;
      }

      public Optional<wu> b() {
         return this.c;
      }
   }
}
