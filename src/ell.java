import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ell implements elg {
   protected static final elg a = new ell(false, -Double.MAX_VALUE, cmh.f, $$0 -> false, null) {
      @Override
      public boolean a(elu $$0, hv $$1, boolean $$2) {
         return $$2;
      }
   };
   private final boolean b;
   private final double c;
   private final cmh d;
   private final Predicate<edz> e;
   @Nullable
   private final blf f;

   protected ell(boolean $$0, double $$1, cmh $$2, Predicate<edz> $$3, @Nullable blf $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   @Deprecated
   protected ell(blf $$0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual blf.bW ()Z
      // 05: aload 1
      // 06: invokevirtual blf.dt ()D
      // 09: aload 1
      // 0a: instanceof blv
      // 0d: ifeq 1a
      // 10: aload 1
      // 11: checkcast blv
      // 14: invokevirtual blv.eT ()Lcmh;
      // 17: goto 1d
      // 1a: getstatic cmh.f Lcmh;
      // 1d: aload 1
      // 1e: instanceof blv
      // 21: ifeq 35
      // 24: aload 1
      // 25: checkcast blv
      // 28: dup
      // 29: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 2c: pop
      // 2d: invokedynamic test (Lblv;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, blv.a (Ledz;)Z, (Ledz;)Z ]
      // 32: goto 3a
      // 35: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, ell.a (Ledz;)Z, (Ledz;)Z ]
      // 3a: aload 1
      // 3b: invokespecial ell.<init> (ZDLcmh;Ljava/util/function/Predicate;Lblf;)V
      // 3e: return
   }

   @Override
   public boolean a(cmc $$0) {
      return this.d.a($$0);
   }

   @Override
   public boolean a(edz $$0, edz $$1) {
      return this.e.test($$1) && !$$0.a().a($$1.a());
   }

   @Override
   public boolean b() {
      return this.b;
   }

   @Override
   public boolean a(elu $$0, hv $$1, boolean $$2) {
      return this.c > (double)$$1.v() + $$0.c(ia.a.b) - 1.0E-5F;
   }

   @Nullable
   public blf c() {
      return this.f;
   }
}
