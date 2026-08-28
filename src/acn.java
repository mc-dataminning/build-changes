import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record acn(int b, int c, int d, List<acn.a> e) implements zh<abw> {
   public static final yy<wl, acn> a = yy.a(yw.h, acn::e, yw.h, acn::f, yw.h, acn::g, acn.a.a.a(yw.a()), acn::h, acn::new);

   public acn(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new acn.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(xd::a))).toList()
      );
   }

   @Override
   public zj<acn> a() {
      return agp.q;
   }

   public void a(abw $$0) {
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

   public List<acn.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<xa> c) {
      public static final yy<wl, acn.a> a = yy.a(yw.p, acn.a::a, xc.e, acn.a::b, acn.a::new);

      public String a() {
         return this.b;
      }

      public Optional<xa> b() {
         return this.c;
      }
   }
}
