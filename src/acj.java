import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record acj(int b, int c, int d, List<acj.a> e) implements zd<abs> {
   public static final yu<wh, acj> a = yu.a(ys.h, acj::e, ys.h, acj::f, ys.h, acj::g, acj.a.a.a(ys.a()), acj::h, acj::new);

   public acj(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new acj.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(wz::a))).toList()
      );
   }

   @Override
   public zf<acj> a() {
      return agl.q;
   }

   public void a(abs $$0) {
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

   public List<acj.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<ww> c) {
      public static final yu<wh, acj.a> a = yu.a(ys.o, acj.a::a, wy.e, acj.a::b, acj.a::new);

      public String a() {
         return this.b;
      }

      public Optional<ww> b() {
         return this.c;
      }
   }
}
