import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class aes implements zs<ach> {
   public static final zj<wi, aes> a = zs.a(aes::a, aes::new);
   private final aes.a b;
   private final List<all> c;
   private final List<all> d;
   private final aws e;

   public aes(aes.a $$0, Collection<all> $$1, Collection<all> $$2, aws $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private aes(wi $$0) {
      this.b = $$0.b(aes.a.class);
      this.e = aws.a($$0);
      this.c = $$0.a(wi::q);
      if (this.b == aes.a.a) {
         this.d = $$0.a(wi::q);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(wi $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, wi::a);
      if (this.b == aes.a.a) {
         $$0.a(this.d, wi::a);
      }
   }

   @Override
   public zu<aes> a() {
      return agw.aj;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public List<all> b() {
      return this.c;
   }

   public List<all> e() {
      return this.d;
   }

   public aws f() {
      return this.e;
   }

   public aes.a g() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
