import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record abq(int b, int c, int d, List<abq.a> e) implements yn<aay> {
   public static final ye<vr, abq> a = ye.a(yc.f, abq::e, yc.f, abq::f, yc.f, abq::g, abq.a.a.a(yc.a()), abq::h, abq::new);

   public abq(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new abq.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(wj::a))).toList()
      );
   }

   @Override
   public yp<abq> a() {
      return afj.r;
   }

   public void a(aay $$0) {
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

   public List<abq.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<wg> c) {
      public static final ye<vr, abq.a> a = ye.a(yc.k, abq.a::a, wi.e, abq.a::b, abq.a::new);

      public String a() {
         return this.b;
      }

      public Optional<wg> b() {
         return this.c;
      }
   }
}
