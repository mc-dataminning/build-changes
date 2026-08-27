import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ehn implements ehi {
   protected static final ehi a = new ehn(false, -Double.MAX_VALUE, cix.b, $$0 -> false, null) {
      @Override
      public boolean a(ehw $$0, gu $$1, boolean $$2) {
         return $$2;
      }
   };
   private final boolean b;
   private final double c;
   private final cix d;
   private final Predicate<eac> e;
   @Nullable
   private final bii f;

   protected ehn(boolean $$0, double $$1, cix $$2, Predicate<eac> $$3, @Nullable bii $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   @Deprecated
   protected ehn(bii $$0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual bii.bV ()Z
      // 05: aload 1
      // 06: invokevirtual bii.dr ()D
      // 09: aload 1
      // 0a: instanceof biy
      // 0d: ifeq 1a
      // 10: aload 1
      // 11: checkcast biy
      // 14: invokevirtual biy.eR ()Lcix;
      // 17: goto 1d
      // 1a: getstatic cix.b Lcix;
      // 1d: aload 1
      // 1e: instanceof biy
      // 21: ifeq 35
      // 24: aload 1
      // 25: checkcast biy
      // 28: dup
      // 29: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 2c: pop
      // 2d: invokedynamic test (Lbiy;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, biy.a (Leac;)Z, (Leac;)Z ]
      // 32: goto 3a
      // 35: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, ehn.a (Leac;)Z, (Leac;)Z ]
      // 3a: aload 1
      // 3b: invokespecial ehn.<init> (ZDLcix;Ljava/util/function/Predicate;Lbii;)V
      // 3e: return
   }

   @Override
   public boolean a(cis $$0) {
      return this.d.a($$0);
   }

   @Override
   public boolean a(eac $$0, eac $$1) {
      return this.e.test($$1) && !$$0.a().a($$1.a());
   }

   @Override
   public boolean b() {
      return this.b;
   }

   @Override
   public boolean a(ehw $$0, gu $$1, boolean $$2) {
      return this.c > (double)$$1.v() + $$0.c(ha.a.b) - 1.0E-5F;
   }

   @Nullable
   public bii c() {
      return this.f;
   }
}
