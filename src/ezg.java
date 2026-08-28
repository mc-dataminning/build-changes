import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ezg implements ezb {
   protected static final ezb a = new ezg(false, -Double.MAX_VALUE, cvs.k, $$0 -> false, null) {
      @Override
      public boolean a(ezq $$0, jf $$1, boolean $$2) {
         return $$2;
      }
   };
   private final boolean b;
   private final double c;
   private final cvs d;
   private final Predicate<eqt> e;
   @Nullable
   private final btr f;

   protected ezg(boolean $$0, double $$1, cvs $$2, Predicate<eqt> $$3, @Nullable btr $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   @Deprecated
   protected ezg(btr $$0, boolean $$1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.struct.gen.VarType.equals(Object)" because "curType" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.setLambdaGenericTypes(NewExprent.java:668)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.toJava(NewExprent.java:401)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:745)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:714)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.toJava(FunctionExprent.java:625)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:745)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:714)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.toJava(FunctionExprent.java:627)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1018)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1153)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:902)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.listToJava(ExprProcessor.java:895)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.toJava(BasicBlockStatement.java:90)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeMethod(ClassWriter.java:1283)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual btr.ce ()Z
      // 05: aload 1
      // 06: invokevirtual btr.dz ()D
      // 09: aload 1
      // 0a: instanceof bun
      // 0d: ifeq 1a
      // 10: aload 1
      // 11: checkcast bun
      // 14: invokevirtual bun.eW ()Lcvs;
      // 17: goto 1d
      // 1a: getstatic cvs.k Lcvs;
      // 1d: iload 2
      // 1e: ifeq 29
      // 21: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, ezg.b (Leqt;)Z, (Leqt;)Z ]
      // 26: goto 46
      // 29: aload 1
      // 2a: instanceof bun
      // 2d: ifeq 41
      // 30: aload 1
      // 31: checkcast bun
      // 34: dup
      // 35: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 38: pop
      // 39: invokedynamic test (Lbun;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, bun.a (Leqt;)Z, (Leqt;)Z ]
      // 3e: goto 46
      // 41: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, ezg.a (Leqt;)Z, (Leqt;)Z ]
      // 46: aload 1
      // 47: invokespecial ezg.<init> (ZDLcvs;Ljava/util/function/Predicate;Lbtr;)V
      // 4a: return
   }

   @Override
   public boolean a(cvn $$0) {
      return this.d.a($$0);
   }

   @Override
   public boolean a(eqt $$0, eqt $$1) {
      return this.e.test($$1) && !$$0.a().a($$1.a());
   }

   @Override
   public ezq a(dus $$0, dds $$1, jf $$2) {
      return $$0.b($$1, $$2, this);
   }

   @Override
   public boolean b() {
      return this.b;
   }

   @Override
   public boolean a(ezq $$0, jf $$1, boolean $$2) {
      return this.c > (double)$$1.v() + $$0.c(jk.a.b) - 1.0E-5F;
   }

   @Nullable
   public btr c() {
      return this.f;
   }
}
