import java.util.function.Predicate;
import javax.annotation.Nullable;

public class emd implements ely {
   protected static final ely a = new emd(false, -Double.MAX_VALUE, cmy.f, $$0 -> false, null) {
      @Override
      public boolean a(emm $$0, hx $$1, boolean $$2) {
         return $$2;
      }
   };
   private final boolean b;
   private final double c;
   private final cmy d;
   private final Predicate<eer> e;
   @Nullable
   private final blv f;

   protected emd(boolean $$0, double $$1, cmy $$2, Predicate<eer> $$3, @Nullable blv $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   @Deprecated
   protected emd(blv $$0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual blv.bW ()Z
      // 05: aload 1
      // 06: invokevirtual blv.dt ()D
      // 09: aload 1
      // 0a: instanceof bml
      // 0d: ifeq 1a
      // 10: aload 1
      // 11: checkcast bml
      // 14: invokevirtual bml.eT ()Lcmy;
      // 17: goto 1d
      // 1a: getstatic cmy.f Lcmy;
      // 1d: aload 1
      // 1e: instanceof bml
      // 21: ifeq 35
      // 24: aload 1
      // 25: checkcast bml
      // 28: dup
      // 29: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 2c: pop
      // 2d: invokedynamic test (Lbml;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, bml.a (Leer;)Z, (Leer;)Z ]
      // 32: goto 3a
      // 35: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, emd.a (Leer;)Z, (Leer;)Z ]
      // 3a: aload 1
      // 3b: invokespecial emd.<init> (ZDLcmy;Ljava/util/function/Predicate;Lblv;)V
      // 3e: return
   }

   @Override
   public boolean a(cmt $$0) {
      return this.d.a($$0);
   }

   @Override
   public boolean a(eer $$0, eer $$1) {
      return this.e.test($$1) && !$$0.a().a($$1.a());
   }

   @Override
   public boolean b() {
      return this.b;
   }

   @Override
   public boolean a(emm $$0, hx $$1, boolean $$2) {
      return this.c > (double)$$1.v() + $$0.c(ic.a.b) - 1.0E-5F;
   }

   @Nullable
   public blv c() {
      return this.f;
   }
}
