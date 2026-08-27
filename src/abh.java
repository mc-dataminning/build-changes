import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class abh implements xf<za> {
   private final abh.a a;
   private final List<ahg> b;
   private final List<ahg> c;
   private final arv d;

   public abh(abh.a $$0, Collection<ahg> $$1, Collection<ahg> $$2, arv $$3) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      this.c = ImmutableList.copyOf($$2);
      this.d = $$3;
   }

   public abh(ui $$0) {
      this.a = $$0.b(abh.a.class);
      this.d = arv.a($$0);
      this.b = $$0.a(ui::t);
      if (this.a == abh.a.a) {
         this.c = $$0.a(ui::t);
      } else {
         this.c = ImmutableList.of();
      }
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
      this.d.b($$0);
      $$0.a(this.b, ui::a);
      if (this.a == abh.a.a) {
         $$0.a(this.c, ui::a);
      }
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public List<ahg> a() {
      return this.b;
   }

   public List<ahg> d() {
      return this.c;
   }

   public arv e() {
      return this.d;
   }

   public abh.a f() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
